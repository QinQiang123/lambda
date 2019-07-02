package pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * @author QinQiang
 * @description
 * @since 2019-01-11 14:44
 */
@Data
@NoArgsConstructor
public class Shop {

    private String name;


    public Shop(String name) {
        this.name = name;
    }

    public double getPrice(String product) {
        return calculatePrice(product);
    }


    private void delay() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private double calculatePrice(String product) {
        delay();
        Random random = new Random();
        return random.nextDouble() * product.charAt(0) + product.charAt(1);
    }

    public Future<Double> getPriceAsync(String product) {

        return CompletableFuture.supplyAsync(() -> calculatePrice(product));
    }

}
