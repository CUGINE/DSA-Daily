package AMCAT;
// Sample Input: 123421
// Sample Output: baecab
import java.util.*;

public class Q7 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[] arr = new char[10];
        String vowel="aeiou";

        arr[2]='a';
        arr[3]='e';
        arr[5]='i';
        arr[7]='o';
            char ch='b';
        for(int i=1;i<10;i++){
            if(arr[i]==0){
                while(vowel.indexOf(ch)!=-1){
                    ch++;
                }
                arr[i]=ch++;
            }
        }
        String N=String.valueOf(n);
        for(int i=0;i<N.length();i++){
            int digit= N.charAt(i) -'0';

            System.out.print(arr[digit]);
        }
        sc.close();

}
}
