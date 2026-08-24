import java.util.*;

public class ClosestLargenumber
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int k = sc.nextInt();

        int len = n.length();
        int ans = Integer.MAX_VALUE;

        for (int mask = 1; mask < (1 << len); mask++) {

            String s = "";

            for (int i = 0; i < len; i++) {
                if ((mask & (1 << i)) != 0) {
                    s = s + n.charAt(i);
                }
            }

            int num = Integer.parseInt(s);

            if (num > k && num < ans) {
                ans = num;
            }
        }

        if (ans == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(ans);
    }
}