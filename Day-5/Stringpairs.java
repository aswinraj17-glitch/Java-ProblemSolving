import java.util.*;

public class Stringpairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] pairs = input.split(",");

        String result = "";

        for (int i = 0; i < pairs.length; i++) {

            String[] parts = pairs[i].split(":");

            String name = parts[0];
            String code = parts[1];

            int len = name.length();
            int max = -1;
            for (int j = 0; j < code.length(); j++) {
                int digit = code.charAt(j) - '0';

                if (digit <= len && digit > max) {
                    max = digit;
                }
            }

            if (max == -1) {
                result = result + "X";
            } else {
                result = result + name.charAt(max - 1);
            }
        }

        System.out.println(result);
    }
}