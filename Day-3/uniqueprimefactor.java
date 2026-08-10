import java.util.*;

public class uniqueprimefactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");

                while (num % i == 0) {
                    num /= i;
                }
            }
        }

        if (num > 1) {
            System.out.print(num);
        }
    }
}