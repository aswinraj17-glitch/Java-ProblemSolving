import java.util.Scanner;

public class SpeedMonitor{
    public static  void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int S=sc.nextInt();
        int L=sc.nextInt();
        int R=sc.nextInt();
        
        int effectiveLimit=L;
        if(R==1){
            effectiveLimit=L-10;
        }
        
        int excess= S - effectiveLimit;
        if(excess<=0){
            System.out.println("SAFE");
        }
        else if(excess<=10){
            System.out.println("WARNING");
            
        }
        else if(excess<=30){
            System.out.println("FINE 1000");
            
        }else{
            System.out.println("FINE 3000");
            
        }
        
        
    }
}
