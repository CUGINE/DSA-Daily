package AMCAT;

import java.util.*;
//max of min sub array ele
public class Q1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans=Integer.MIN_VALUE;

        for(int i=0;i<=n-k;i++){
            int min=Integer.MAX_VALUE;

            for(int j=i;j<i+k;j++){
                min= Math.min(arr[j],min);
            }
            ans=Math.max(min,ans);
        }
        System.out.println(ans);
        sc.close();
    }
}
