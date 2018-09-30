package demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @discription 红包算法学习
 * 随机产生红包：金额正太分布
 *  * <p>
 *  * 如果非标准正态分布X~N(μ,σ^2)，那么关于X的一个一次函数 (X-μ)/σ ，就一定是服从标准正态分布N(0,1)。
 *  * 举个具体的例子，一个量X，是非标准正态分布，期望是10，方差是5^2（即X~N(10,5^2)）；那么对于X的线性函数Y=(X-10)/5，Y就是服从标准正态分布的Y~N(0,1)。
 * @author QinQiang
 * @since 2018-09-25 15:15
 */
public class Demo24 {

    private static Random random = new Random();

    private static BigDecimal MIN_VALUE = new BigDecimal("0.01");

    private static boolean isMin = false;

    /**
     * create by    :XJH
     * description  :
     * create time  :2017/12/5/005
     *
     * @param amountValue 红包总金额
     * @param sizeValue   红包个数
     * @param maxMutValue 剩余红包限定倍数
     * @param sigmaValue  标准差倍数
     * @return java.util.List<java.math.BigDecimal>
     */
    public static List<BigDecimal> getAllHotPacket(double amountValue, double sizeValue, double maxMutValue, double sigmaValue) {
        //红包总金额
        BigDecimal restAmount = new BigDecimal(String.valueOf(amountValue));
        //红包个数
        BigDecimal size = new BigDecimal(String.valueOf(sizeValue));
        //（平均值）amountValue/sizeValue保留两位小数四舍五入
        BigDecimal mu = restAmount.divide(size, 2, BigDecimal.ROUND_HALF_DOWN);
        //平均值
        BigDecimal avg = new BigDecimal(mu.toString());
        BigDecimal MAX_MUT = new BigDecimal(String.valueOf(maxMutValue));
        double sigma = sigmaValue <= 0 ? 1 : sigmaValue;
        //返回的红包集合
        List<BigDecimal> hotPacketPool;
        do {
            //这是为了最后的数据不正确重来做准备
            restAmount = new BigDecimal(String.valueOf(amountValue));
            hotPacketPool = new ArrayList<>(size.intValue());
            int hotPacketSize = size.intValue() - 1;
            //随机出前size-1个红包，最后一个红包取剩余值，并且最后一个红包不能过大，有均值的限定倍数
            for (int i = 0; i < hotPacketSize; i++) {
                BigDecimal randomBigDecimal = getRandomHotPacketAmount(mu.doubleValue(), sigma, restAmount, size.intValue() - 1);
                //总金额减去本次红包的金额
                restAmount = restAmount.subtract(randomBigDecimal);
                System.out.println("剩下的红包金额：" + restAmount);
                //剩余红包个数-1
                size = size.subtract(BigDecimal.ONE);
                //（平均值）剩余金额/剩余红包个数，保留两位小数
                mu = restAmount.divide(size, 2, BigDecimal.ROUND_HALF_DOWN);
                //本次红包放入返回的集合中
                hotPacketPool.add(randomBigDecimal);
            }
            //最后一个红包剩余的金额放到集合中
            hotPacketPool.add(restAmount);
            //这是为了最后的数据不正确重来做准备
            size = new BigDecimal(String.valueOf(sizeValue));
        } while (restAmount.compareTo(avg.multiply(MAX_MUT)) > 0);
        //打乱红包顺序，因为越早的红包均值最高
        //倒序遍历list，然后在当前位置随机一个比当前位置小的int数字，交换数字
        Collections.shuffle(hotPacketPool);
        return hotPacketPool;
    }

    /**
     * create by    :XJH
     * description  :根据剩余红包金额均值，标准差大小，计算出随机红包的大小
     * create time  :2017/12/5/005
     *
     * @param mu       平均值
     * @param sigma    标准差倍数
     * @param rest     剩下的钱
     * @param restSize 还剩多少红包
     * @return java.math.BigDecimal
     */
    private static BigDecimal getRandomHotPacketAmount(double mu, double sigma, BigDecimal rest, int restSize) {
        if (isMin) {
            return MIN_VALUE;
        }
        BigDecimal radomNo;
        //剩余最小的钱（剩下的人（本次除外） * 0.01）
        BigDecimal minRest = MIN_VALUE.multiply(new BigDecimal(restSize));
        //随机出的红包也得满足剩余红包最少0.01
        do {
            //随机本次红包
            radomNo = getRandom(mu, mu * sigma);
        }
        //如果剩余的钱-本次红包-剩下的人（本次除外）*0.01<0，则重来
        while (rest.subtract(radomNo).subtract(minRest).compareTo(BigDecimal.ZERO) < 0);
        if (rest.subtract(radomNo).subtract(minRest).compareTo(BigDecimal.ZERO) == 0) {
            //如果本次红包随机完毕，符合要求，且剩下的钱仅仅够分接下来的每一个人0.01元，则在接下来几次直接返回0.01。
            isMin = true;
        }
        BigDecimal randomBigDecimal = radomNo;
        //对红包金额取2位小数
        randomBigDecimal = randomBigDecimal.setScale(2, BigDecimal.ROUND_HALF_DOWN);
        //判断金额不能小于0.01元
        randomBigDecimal = randomBigDecimal.compareTo(MIN_VALUE) > 0 ? randomBigDecimal : MIN_VALUE;
        return randomBigDecimal;
    }

    /**
     * create by    :XJH
     * description  :产生mu sigma的正态分布的double值
     * create time  :2017/12/5/005
     *
     * @param mu    剩余金额/剩余红包（平均值）
     * @param sigma 标准差倍数
     * @return java.math.BigDecimal
     */
    private static BigDecimal getRandom(double mu, double sigma) {
        double randomValue = random.nextGaussian() * sigma + mu;
        BigDecimal value = new BigDecimal(String.valueOf(randomValue)).abs();
        return value;
    }

    public static void main(String[] args) {
        BigDecimal all = BigDecimal.ZERO;
        List<BigDecimal> allHotPacket = getAllHotPacket(100d, 10d, 3d, 1d);
        int size = allHotPacket.size();
        BigDecimal max = BigDecimal.ZERO;
        int maxIndex = 0;
        for (int i = 0; i < size; i++) {
            BigDecimal amout = allHotPacket.get(i);
            System.out.println("第" + (i + 1) + "随机的红包金额大小：" + amout);
            if (amout.compareTo(max) > 0) {
                max = amout;
                maxIndex = i + 1;
            }
            all = all.add(amout);
        }
        System.out.println("所有红包金额为红包：" + all);
        System.out.println("手气最佳为：第" + maxIndex + "个红包，金额为：" + max);
    }


}
