package task3;

public final class StringUtils {
    private StringUtils() {
    }

    public static String betterString(String str1, String str2, TwoStringPredicate predicate) {
        if (predicate.test(str1, str2)) {
            return str1;
        }
        return str2;
    }
}
