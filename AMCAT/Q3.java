package AMCAT;
import java.util.*;
public class Q3 {

    static String formatProducts(int x,int y){
        long res = 1;
        for(int i=x;i<=y;i++){
            res*=i;
        }
        int pow=0;
        while(res%10==0){
            res /= 10;
            pow++;

        }
        return res + " * 10^" + pow;

    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(formatProducts(A, B));

        sc.close();
    }
}
