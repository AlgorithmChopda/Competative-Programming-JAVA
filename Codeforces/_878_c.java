package Codeforces;

import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class _878_c {
    
    static long cal(long n, long k) {
        if(n < k)   return 0;
        
        long ans = 0;
        for(; k <= n ; k++) {
            ans += (n - k + 1);
//            System.out.println("-> "+ans);
        }
        
        return ans;
    }
    static class Solution {
        public void solve(Scanner sc) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            int t = sc.nextInt();
            int ar[] = new int[n];
            for(int i = 0 ; i < n ; i++) {
                ar[i] = sc.nextInt();
            }
            
            long ans = 0, cnt = 0;
            for(int i = 0 ; i < n ; i++) {
                if(ar[i] <= t) {
                    cnt++;
                }
                else {
                    ans += cal(cnt, (long)d);
//                    System.out.println(ans);
                    cnt = 0;
                }
            }
            
            ans += cal(cnt, (long)d);
            System.out.println(ans);
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            new Solution().solve(sc);
        }
    }
}
