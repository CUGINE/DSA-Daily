package AMCAT;
import java.util.*;
public class Q10 {
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int s=2*n-1;

        for(int i=0;i<s;i++){
            int row=Math.min(i,s-i-1);
            int stars=n-row-1;

            for(int j=0;j<s;j++){
                if(j<stars || j>=s-stars){
                    System.out.print("*");
                }
                else System.out.print(".");
            }
            System.out.println();
        }
}
}
