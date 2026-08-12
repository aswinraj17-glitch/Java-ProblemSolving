import java.util.Scanner;
public class RotationCode{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int first=n/10;
        int last=n%10;
        int rot=last*100+first;
        System.out.println("Rotated: "+rot);
        if(rot>temp){
        System.out.println("Relation: GREATER");
            
        }else if(rot==temp){
        System.out.println("Relation: EQUAL");
            
        }else{
        System.out.println("Relation: SMALLER");
            
        }
        sc.close();
    }
}