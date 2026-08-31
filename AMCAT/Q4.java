package AMCAT;
import java.util.*;


class Q4 {

    public static void rotateLeft(int a[], int n, int d) {

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = a[(i + d) % n];
        }

        for (int i = 0; i < n; i++) {
            a[i] = result[i];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        rotateLeft(a, n, d);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}