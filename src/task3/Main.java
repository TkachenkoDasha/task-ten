package task3;

import static task3.StringUtils.betterString;

public class Main {
    public static void main(String[] args) {
        String str1 = "First string";
        String str2 = "Second string";
        System.out.println("Better string in first case: "
                + betterString(str1, str2, (s1, s2) -> s1.length() > s2.length()));
        System.out.println("Better string in second case: " + betterString(str1, str2, (s1, s2) -> true));

    }
}
