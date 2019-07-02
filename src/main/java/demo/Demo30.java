package demo;

import pojo.Shop;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

import static java.util.stream.Collectors.toList;

/**
 * @author QinQiang
 * @description 组合式异步编程
 * @since 2019-01-11 14:00
 */
public class Demo30 {

    static List<Shop> shops = Arrays.asList(new Shop("BestPrice"), new Shop("LetsSaveBig"), new Shop("MyFavoriteShop"), new Shop("BuyItAll"));
    private static Random random = new Random();

    public static void main(String[] args) {

        /*long start = System.nanoTime();
        Future<Double> futurePrice = getPriceAsync("my favorite product");
        long invocationTime = ((System.nanoTime() - start) / 1_000_000);
        System.out.println("Invocation returned after " + invocationTime + " msecs");
        try {
            Thread.sleep(1000L);
            double price = futurePrice.get();
            System.out.printf("Price is %.2f%n", price);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        long retrievalTime = ((System.nanoTime() - start) / 1_000_000);
        System.out.println("Price returned after " + retrievalTime + " msecs");*/

        long start = System.nanoTime();
        System.out.println(findPrices("myPhone27S"));
        long duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println("Done in " + duration + " msecs");


    }


    public static List<String> findPrices(String product) {
        return shops.parallelStream().map(shop -> String.format("%s price is %.2f", shop.getName(),
                shop.getPrice(product)))
                .collect(toList());
    }

    public static double getPrice(String product) {
        return calculatePrice(product);
    }


    private static void delay() {
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static double calculatePrice(String product) {
        delay();
        return random.nextDouble() * product.charAt(0) + product.charAt(1);
    }

    public static Future<Double> getPriceAsync(String product) {

        return CompletableFuture.supplyAsync(() -> calculatePrice(product));
    }


}
