import java.util.Scanner;

public class SpecificNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long start = sc.nextLong();
        long end = sc.nextLong();

        if (start > end) {
            System.out.println(-1);
            return;
        }

        int count = 0;

        for (long i = start; i <= end; i++) {

            long temp = i;
            boolean valid = true;

            while (temp > 0) {
                long digit = temp % 10;

                if (digit != 1 && digit != 4 && digit != 9) {
                    valid = false;
                    break;
                }

                temp = temp / 10;
            }

            if (valid) {
                count++;
            }
        }

        System.out.println(count);
    }
}