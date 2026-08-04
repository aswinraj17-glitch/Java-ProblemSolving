import java.util.Scanner;
public class smallestNumberNthFactor{
    public static long factor(long n1,long n2,long n3){
        long res=0;
        for(long i=n1;i<=n2;i++){
            long num=i;
            long count=0;
            for(long j=1;j<=num;j++){
                if(num%j==0){
                    count++;
                }
            }
            if(count>n3){
                res=num;
                break;
            }
        }
        return res;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long n1=sc.nextLong();
        long n2=sc.nextLong();
        long n3=sc.nextLong();
        long ans=factor(n1,n2,n3);
        System.out.println(ans);
        sc.close();
    }
}