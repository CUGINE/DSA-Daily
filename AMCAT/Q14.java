package AMCAT;

import java.util.*;

class Q14 {

    static int countEndingWithK(int start, int end, int k) {

        int count = 0;
        
        for(int i=start;i<=end;i++){
            if(i%10==2) count++;
        }

       return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(countEndingWithK(start, end, k));
    }
}
