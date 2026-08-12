import java.util.Scanner;
public class Palindrome{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int st=sc.nextInt();
        int end=sc.nextInt();
        System.out.println("Palindrome numbers between "+st+" and "+end+" are:");
        for(int i=st+1;i<=end;i++){
                int num=i;
                int temp=num;
                int rev=0;
                while(temp!=0){
                    int digit=temp%10;
                    rev=rev*10+digit;
                    temp=temp/10;
                }
                if(num==rev){
                    System.out.print(i+" ");
                }
                
            
        }
        sc.close();
    }
}