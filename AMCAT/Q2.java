package AMCAT;

import java.util.*;

public class Q2 {

    static int Low(int[] arr, int x){//index of first ele>=X
        int s=0, e=arr.length-1;

        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]>=x){
                e=m-1;
            }
            else s=m+1;

        }
        return s;
    }
    static int U(int[] arr,int y){
            int s=0,e=arr.length-1;

        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]<=y){
                s=m+1;
            }
            e=m-1;
            
        }
        return e;
    }
    static int count(int[] arr,int l,int u){
        int L=Low(arr,l);
        int R=U(arr,u);
        if(L>R) return 0;
        return  R-L+1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 3, 9, 10, 4};

        Arrays.sort(arr);

        System.out.println(count(arr, 1, 4));
        System.out.println(count(arr, 9, 12));
    }
}
