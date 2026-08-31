package AMCAT;

import java.util.*;

public class Q12 {
    static int sumOddFrequency(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int sum=0;
        for(int x:map.keySet()){
            if(map.get(x)%2!=0){
                sum+=x;
            }
        }
    return sum;
    }
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(sumOddFrequency(arr));
    }
}

