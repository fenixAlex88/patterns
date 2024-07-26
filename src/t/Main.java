package t;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(1666));
        System.out.println(camelCase("camelCasing"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
        System.out.println(getPINs("1357"));
        System.out.println(score(new int[]{2,4,4,5,4}));
    }

    public static String solution(int n) {
        StringBuilder res = new StringBuilder();
        res.append("M".repeat(Math.max(0, n / 1000)));
        n = n % 1000;
        res.append("D".repeat(Math.max(0, n / 500)));
        n = n % 500;
        res.append("C".repeat(Math.max(0, n / 100)));
        n = n % 100;
        res.append("L".repeat(Math.max(0, n / 50)));
        n = n % 50;
        res.append("X".repeat(Math.max(0, n / 10)));
        n = n % 10;
        res.append("V".repeat(Math.max(0, n / 5)));
        n = n % 5;
        res.append("I".repeat(Math.max(0, n)));
        return res.toString();
    }

    public static String camelCase(String input) {
        StringBuilder res = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                res.append(" ");
                res.append(Character.toLowerCase(c));
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }

    public static String whoLikesIt(String... names) {
        return switch (names.length) {
            case 0 -> "no one likes this";
            case 1 -> names[0] + " likes this";
            case 2 -> names[0] + " and " + names[1] + " like this";
            case 3 -> names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default -> names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        };
    }

    private static final char[][] ADJACENT_KEYS = {
            {'0', '8'},
            {'1', '2', '4'},
            {'1', '2', '3', '5'},
            {'2', '3', '6'},
            {'1', '4', '5', '7'},
            {'2', '4', '5', '6', '8'},
            {'3', '5', '6', '9'},
            {'4', '7', '8'},
            {'5', '7', '8', '9', '0'},
            {'6', '8', '9'}
    };

    public static List<String> getPINs(String observed) {
        List<String> result = new ArrayList<>();
        generatePINs(observed, "", result);
        return result;
    }

    private static void generatePINs(String observed, String current, List<String> result) {
        if (observed.isEmpty()) {
            result.add(current);
            return;
        }

        char digit = observed.charAt(0);
        char[] possibleDigits = ADJACENT_KEYS[digit - '0'];

        for (char possibleDigit : possibleDigits) {
            generatePINs(observed.substring(1), current + possibleDigit, result);
        }
    }

    public static int score(int[] dice) {
        int[] counts = new int[7];
        for (int die : dice) {
            counts[die]++;
        }
        int score = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] >= 3) {
                if (i == 1) score += 1000;
                else score += i * 100;
                counts[i] -= 3;
            }
        }
        score += counts[1] * 100;
        score += counts[5] * 50;
        return score;
    }

    public static int[] isPerfectPower(int n) {
        for (int m = 2; m <= Math.sqrt(n); m++) {
            int k = 2;
            int power = (int) Math.pow(m, k);
            while (power <= n && power > 0) {
                if (power == n) {
                    return new int[]{m, k};
                }
                k++;
                power = (int) Math.pow(m, k);
            }
        }
        return null;
    }

    public static String orderWeight(String strng) {
        String[] numbers = strng.trim().split("\\s+");
        Arrays.sort(numbers, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                int weightA = getWeight(a);
                int weightB = getWeight(b);
                if (weightA == weightB) {
                    return a.compareTo(b);
                } else {
                    return Integer.compare(weightA, weightB);
                }
            }
        });
        return String.join(" ", numbers);
    }

    private static int getWeight(String number) {
        int weight = 0;
        for (char c : number.toCharArray()) {
            weight += Character.getNumericValue(c);
        }
        return weight;
    }
}
