import java.util.Scanner;

public class CharacterCount {
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         char[]arr=s.toCharArray();
         int count=0;
         for(char num : arr){
            count++;
         }
         System.out.println(count);
         sc.close();
    }
}
