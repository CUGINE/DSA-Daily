package AMCAT;

import java.util.*;

public class Q8 {
    static int minFountains(int[] a, int pos, int n, HashMap<Integer, Integer> memo) {
        if(pos>=n) return 0;

        if(memo.containsKey(pos)) return memo.get(pos);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int left=Math.max(i-a[i],0);
            int right=Math.min(i+a[i],n-1);
//pos curr check can fountain cover;
            if(left<=pos && pos<=right){
                int next=right+1;

               if (next > pos) {
                    ans = Math.min(ans,
                            1 + minFountains(a, next, n, memo));
                }
            }
        }
        memo.put(pos,ans);
        
        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> memo = new HashMap<>();

        System.out.println(minFountains(a, 0, n, memo));
    }
}
