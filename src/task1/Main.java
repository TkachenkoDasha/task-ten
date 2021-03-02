package task1;

import java.util.Arrays;

public class Main {

    public static final ArrayProcessor max = array1 -> Arrays.stream(array1).max().getAsDouble();
    public static final ArrayProcessor min = array1 -> Arrays.stream(array1).min().getAsDouble();
    public static final ArrayProcessor sum = array1 -> Arrays.stream(array1).sum();
    public static final ArrayProcessor avg = array1 -> Arrays.stream(array1).average().getAsDouble();

    public static void main(String[] args) {
        double[] array = {3.4, 6.0, 123.56, -23.0, 78.98, 45.76, -34.78, -98.07, 56.77, 3.02};

        System.out.println("Max value of array: " + max.apply(array));
        System.out.println("Min value of array: " + min.apply(array));
        System.out.println("Sum of array: " + sum.apply(array));
        System.out.println("Average value of array: " + avg.apply(array));

    }

}
