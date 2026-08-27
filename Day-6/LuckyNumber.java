import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        boolean lucky = true;

        while (n > 0) {

            long digit = n % 10;
            long temp = n / 10;

            while (temp > 0) {
                long nextDigit = temp % 10;

                if (digit == nextDigit) {
                    lucky = false;
                    break;
                }

                temp = temp / 10;
            }

            if (!lucky) {
                break;
            }

            n = n / 10;
        }

        if (lucky) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
