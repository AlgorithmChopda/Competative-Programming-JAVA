/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author Vinay Jain
 */
public class Weekly_367 {
    String getSmallest(String a, String b) {
        if(a.isEmpty()) return b;
        if(a.length() != b.length()) {
            if(a.length() < b.length()) return a;
            return b;
        }
        if(a.compareTo(b) <= 0) return a;
        return b;
    }
    public String shortestBeautifulSubstring(String s, int k) {
        int i = 0, j = 0;
        String ans = "";
        while(i <= s.length()) {
            while(i < s.length() && s.charAt(i) == '0') {
               i++;
            }
            j = i;
            int cnt = 0;
            while(j <= s.length() && cnt < k) {
                if(s.charAt(j) == '1')  cnt++;
                j++;
            }
            
            if(cnt == k) {
                System.out.println(i + " " + j);
                ans = getSmallest(ans, s.substring(i, j + 1));
                System.out.println("ans : "+ ans);
                cnt = 0;
            }
            
            i++;
        }
        
        return ans;
    }
    
    public int[] findIndices(int[] ar, int id, int vd) {
        if(ar.length == 1) {
            if(id == 0 && vd == 0)  return new int[] {0, 0};
            return new int[] {-1, -1};
        }
        int j = id, min = 0, max = 0;        
        int start = 1;
        for(int i = id ; i < ar.length ; i++) {
            if(Math.abs(ar[i] - ar[min]) >= vd) {
                return new int[] {min, i};
            }
            
            if(Math.abs(ar[i] - ar[max]) >= vd) {
                return new int[] {max, i};
            }
            
            if(start <= i) {
                if(ar[start] > ar[min]) min = start;
                if(ar[start] < ar[max]) max = start;

                start++;
            }
                
            
        }
        
        return new int[] {-1, -1};
    }
    
    
    public int[][] constructProductMatrix(int[][] mat) {
        int MOD = 12345;
        int ans = 1;
        int n = mat.length, m = mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans = (int)((1L * ans * mat[i][j]) % MOD);
            }
        }
        
        int op[][] = new int[n][m];
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                op[i][j] = ans / mat[i][j];
            }
        }
        
        return op;
    }
}
