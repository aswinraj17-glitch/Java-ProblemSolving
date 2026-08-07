import java.util.Scanner;

public class StrongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start=sc.nextInt();
        int end=sc.nextInt();
        
        for (int num=start;num<=end;num++) {
            int temp=num;
            int sum=0;

            while(temp>0) {
                int digit=temp%10;
                int fact=1;
                for(int i=1;i<=digit;i++) {
                    fact*=i;
                }

                sum+=fact;
                temp/=10;
            }

            if(num==1 ||sum==num) {
                System.out.print(num + " ");
            }
            
        }
    }
}
