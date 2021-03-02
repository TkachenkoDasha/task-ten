package task5;

public class Main {
    public static void main(String[] args) {
     double a = 2.0;
     double b = 5.45;
     double c = 1.27;

     System.out.println(apply((a1, b1, c1) -> b1*b1 - 4*a1*c1, a, b, c));
     System.out.println(apply((a1, b1, c1) -> a1*Math.pow(b1, c1), a, b, c));

    }

    static double apply(DoubleFunction doubleFunction, double a, double b, double c) {
        return doubleFunction.apply(a, b, c);
    }
}
