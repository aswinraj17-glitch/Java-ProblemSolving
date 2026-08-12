import java.util.Scanner;

public class AddCarryCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        int i = s1.length() - 1;
        int j = s2.length() - 1;

        int carry = 0;
        int count = 0;

        while (i >= 0 || j >= 0) {

            int n1 = 0;
            int n2 = 0;

            if (i >= 0) {
                n1 = s1.charAt(i) - '0';
            }

            if (j >= 0) {
                n2 = s2.charAt(j) - '0';
            }

            int sum = n1 + n2 + carry;

            if (sum >= 10) {
                count++;
                carry = 1;
            } else {
                carry = 0;
            }

            i--;
            j--;
        }

        System.out.println("Carry Operations: " + count);
        sc.close();
    }
}