import java.util.*;

public class nthCommnFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int range = sc.nextInt();
        int a1 = 0;
        int[] arr1 = new int[a]; 
        int a2 = 0;
        int[] arr2 = new int[b];
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                arr1[a1] = i;
                a1++;
            }
        }
        
        for (int i = 1; i <= b; i++) {
            if (b % i == 0) {
                arr2[a2] = i;
                a2++;
            }
        }

        int z = a1 + a2;

        int arr[] = new int[z];

        for (int i = 0; i < a1; i++) {
            arr[i] = arr1[i];
        }

        for (int i = 0; i < a2; i++) {
            arr[i + a1] = arr2[i];
        }

        int count = 0;

        for (int i = 0; i < a1; i++) {
            for (int j = 0; j < a2; j++) {
                if (arr1[i] == arr2[j]) {
                    count++;
                    if (count == range) {
                        System.out.println(arr1[i]);
                        return;
                    }
                }
            }
        }
        sc.close();
    }
}
