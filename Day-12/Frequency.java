import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.toLowerCase();
        int freq [] = new int [26];
        for(char ch : s.toCharArray()){
            if(ch>= 'a' && ch <= 'z'){
                freq[ch - 'a']++;
            }
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println((char)(i+97) + " : " +freq[i]);
            }
        }

        scan.close();
    }
}
