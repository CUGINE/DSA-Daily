package AMCAT;

import java.util.*;

public class Q6 {
    public static void possibilities(int n) {
        int count=0;
        String b="";
        for(int i=1;count<n;i++){
            String s=Integer.toString(i,2);

            if(!s.contains("11")){
                count++;
                b=s;
            }
        }
        System.out.println(b);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        int[] a = new int[tc];

        // Take all test cases
        for (int i = 0; i < tc; i++) {
            a[i] = sc.nextInt();
        }

        // Solve each test case
        for (int i = 0; i < tc; i++) {
            possibilities(a[i]);
        }
        sc.close();
    }
}

