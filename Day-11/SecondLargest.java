import java.util.Scanner;

public class SecondLargest {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int max=0;
        int secmax=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                secmax=max;
                max=arr[i];
            }
            else if(arr[i]>secmax && secmax!=max){
                secmax=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(secmax);
        sc.close();

    }
}
