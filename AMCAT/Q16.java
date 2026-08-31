package AMCAT;

import java.util.Scanner;

class Q16 {

    static int countKDigits(int[] arr, int k) {

        int count = 0;

        for (int x : arr) {

            if (String.valueOf(x).length() == k) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int k = sc.nextInt();

        System.out.println(countKDigits(arr, k));
    }
}
