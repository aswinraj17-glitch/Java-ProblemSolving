import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            int temp = i;
            while (temp != 1 && temp != 4) {
                int sum = 0;
                while (temp > 0) {
                    int digit = temp % 10;
                    sum += digit * digit;
                    temp = temp / 10;
                }
                
                temp = sum;
            }
            if (temp == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
