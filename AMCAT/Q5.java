package AMCAT;

import java.util.*;

public class Q5 {

    static int MinCut(int n, int[] arr){
            int min=Integer.MAX_VALUE;
            int count=0;

            for(int i=0;i<n;i++){
                if(arr[i]<min){
                    min=arr[i];
                    count++;
                }
            }
            return count-1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(MinCut(n, arr));

        sc.close();
    }
}
