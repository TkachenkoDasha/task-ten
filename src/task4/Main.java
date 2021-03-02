package task4;

public class Main {
    public static void main(String[] args) {
        int n = 565;
        InspectorOfMultiplicity multiplicity = k -> k % 5 == 0;
        System.out.println(multiplicity.test(n));
    }
}
