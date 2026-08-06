import java.util.Scanner;

public class kaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long start = sc.nextLong();
        long end = sc.nextLong();

        for (long i = start; i <= end; i++) {
            long temp = i;
            int digits = 0;

            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            long power = 1;
            for (int j = 0; j < digits; j++) {
                power *= 10;
            }

            long square = i * i;
            long left = square / power;
            long right = square % power;

            if (left + right == i) {
                System.out.print(i + " ");
            }
        }
    }
}