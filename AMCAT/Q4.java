package AMCAT;
import java.util.*;
public class Q4 {

    static int[] rotateL(int[] arr,int d){
        int n=arr.length;
        int[] result= new int[n];

        for(int i=0;i<n;i++){
            result[i]= arr[(i+d)%n];

        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] res= rotateL(arr,d);

        for(int x:res){
            System.out.print(x+" ");
        }
        sc.close();
    }
}
