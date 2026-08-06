import java.util.Scanner;
public class AdamNumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long start=sc.nextLong();
        long end=sc.nextLong();
        for(long i=start;i<=end;i++){
            if(i==0){
                System.out.print(0+" ");
            }
            if(i%10 == 0){
                continue;
            }  
            
            long temp=i;
            long temp1=i;
            long rev=0;
            while(temp>0){
                long digit=temp%10;
                rev=rev*10+digit;
                temp=temp/10;
            }
            
            long sq=rev*rev;
            long sq1=temp1*temp1;
            long rev1=0;
            while(sq1!=0){
                long digit=sq1%10;
                rev1=rev1*10+digit;
                sq1=sq1/10;
            }
        if(sq==rev1){
            System.out.print(i+" ");
        }
    }
        }
}
