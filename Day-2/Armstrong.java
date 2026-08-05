import java.util.*;
public class Armstrong{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
        int count=0;
            int temp=i;
            int temp2=i;
            while(temp>0){
                int digit=temp%10;
                count++;
                temp=temp/10;
            }
            int sum=0;
            while(temp2>0){
                int digit=temp2%10;
                int pow=(int)Math.pow(digit,count);
                sum += pow;
                temp2=temp2/10;
            }
            if(sum==i){
                System.out.print(sum+" ");
            }
        }
    }
}
