import java.util.*;
public class amicablenumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum=0;
        for(int i=1;i<num1;i++){
            if(num1%i==0){
                sum+=i;
            }
        }
        int sum1=0;
        for(int i=1;i<num2;i++){
            if(num2%i==0){
                sum1+=i;
            }
        }
        if(sum==num2 && sum1 == num1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
            
        }
    }
}
