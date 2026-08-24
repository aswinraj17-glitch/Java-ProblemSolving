import java.util.Scanner;
public class ProductNaturalNumbers{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long product=1;
        int sum=0;
        for(int i=1;i<=n;i++){
            product*=i;
        }
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        if(product%sum==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
                
        }
        
        
    }
}