import java.util.Scanner;
public class SmartParking{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int fee=0;
        if(n<=0){
            fee=0;
        }
        else if(n<=2){
            fee=n*30;
        }
        else if(n<=5) {
            fee=(2*30)+((n-2)*20);
        } 
        else{
            fee=(2*30)+(3*20)+((n-5)*10);
        }
        if(n>8) {
            fee+=50;
        }
        System.out.print("Fee: ₹"+fee);
        sc.close();
    }
}