import java.util.*;
public class betrothednumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int sum=0;
        for(int i=1;i<n1;i++){
            if(n1%i==0){
                sum+=i;
            }
        }
          int sum1 = 0;
        for (int i = 1; i < n2; i++) {  
            if (n2 % i == 0) {
                sum1 += i;
            }
        }

        if (sum == n2 + 1 && sum1 == n1 + 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}