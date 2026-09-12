import java.util.Scanner;
public class fibonacci {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        // System.out.print(a+" "+b);
        for(int i=0;i<=n;i++){
            System.out.print(a+" ");
            int c=a+b;
            b=a;
            a=c;
        }
      sc.close();
    }
}
