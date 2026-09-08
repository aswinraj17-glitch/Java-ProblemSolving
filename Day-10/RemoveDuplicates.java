import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[]arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            boolean flag=true;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    flag=false;
                    break;
                }else{
                    flag=true;
                }

            }
            if(flag){
                System.out.print(arr[i]);
            }
        }
        sc.close();

    }
}
