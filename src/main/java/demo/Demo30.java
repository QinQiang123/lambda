package demo;

/**
 * @author QinQiang
 * @since 2018-12-03 15:34
 */
public class Demo30 {


    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] answer = new int[2];
        Outer:
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                    break Outer;
                }
            }
        }
        return answer;
    }
}
