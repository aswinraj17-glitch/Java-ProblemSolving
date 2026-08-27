import java.util.Scanner;

public class Circularnumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n1 = sc.nextLong();
        long n2 = sc.nextLong();

        long temp = n2;
        long multiplier = 1;

        while (temp >= 10) {
            multiplier *= 10;
            temp /= 10;
        }
        long count = multiplier;

        while (count > 0) {

            long lastDigit = n2 % 10;
            n2 = n2 / 10;

            n2 = lastDigit * multiplier + n2;

            if (n2 == n1) {
                System.out.println("Yes");
                return;
            }

            count /= 10;
        }

        System.out.println("No");
    }
}