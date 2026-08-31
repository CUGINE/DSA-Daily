package AMCAT;
import java.util.*;
public class Q11 {
    public static void main(String[] args) {
         String str="aaaabbccc";
 StringBuilder sb= new StringBuilder();
    int n= str.length();

    int i=0;
    while(i<n){
        char ch=str.charAt(i);
        int count=0;

        while(i<n && str.charAt(i)==ch){
            count++;
            i++;
        }
        sb.append(ch);
        if(count>1){
            sb.append(count);
        }

    }
        System.out.println(sb.toString());
    }
   
}
