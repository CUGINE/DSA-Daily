package AMCAT;

import java.util.*;

class Q17 {

    static int sumOfProducts(int n) {

        int sum = 0;

       for(int i=1;i<=n;i++){
        int j= n/i;
        sum+=i*j;
       }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(sumOfProducts(n));
    }
}
