package AMCAT;

import java.util.*;

public class Q9 {
     static long minTime(long[] a) {
        PriorityQueue<Long> pq= new PriorityQueue<>();
        for(long x:a){
            pq.add(x);
        }
        long total=0;
        while(pq.size()>1){
            long x=pq.poll();
            long y=pq.poll();

            long sum=x+y;

            total+=sum;

            pq.add(sum);
        }
        return total;

     }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int l = 0; l < t; l++) {

            int n = sc.nextInt();

            long[] c = new long[n];

            for (int i = 0; i < n; i++) {
                c[i] = sc.nextLong();
            }

            System.out.println(minTime(c));
        }

        sc.close();
    }
}
