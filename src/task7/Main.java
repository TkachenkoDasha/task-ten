package task7;

import java.util.function.IntSupplier;

public class Main {
    public static void main(String[] args) {
        IntSupplier randomInt = () -> (int) (Math.random() * 10);

        System.out.println(randomInt.getAsInt());
    }
}
