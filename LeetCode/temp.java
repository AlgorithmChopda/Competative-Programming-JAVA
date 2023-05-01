/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class temp {
    class TreeNode {
        int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
    
    class Solution {
        public void solve(Scanner sc){
            
        }
        
        public int minSwaps(int[] arr, int N)
    {
        int ans = 0;
        int[] temp = Arrays.copyOfRange(arr, 0, N);
        Arrays.sort(temp);
        for (int i = 0; i < N; i++)
        {
 
            // This is checking whether
            // the current element is
            // at the right place or not
            if (arr[i] != temp[i])
            {
                ans++;
 
                // Swap the current element
                // with the right index
                // so that arr[0] to arr[i] is sorted
                swap(arr, i, indexOf(arr, temp[i]));
            }
        }
        return ans;
    }
    public void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int indexOf(int[] arr, int ele)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == ele) {
                return i;
            }
        }
        return -1;
    }
        
        
        public int minimumOperations(TreeNode root) {
            Queue<TreeNode> ar = new LinkedList<>();
            ar.add(root);
            ar.add(new TreeNode(-1));
            
            int op[] = new int[1000000];
            int k = 0, ans = 0;
            
            while(!ar.isEmpty()){
               TreeNode temp = ar.remove();
               if(temp.val == -1 && ar.isEmpty() == false){
                   ans += minSwaps(op, k);
                   k = 0;
                   ar.add(new TreeNode(-1));
               }
               else{
                   if(temp.left != null){
                       ar.add(temp.left);
                       op[k] = temp.val;    k++;
                   }
                   if(temp.right != null){
                       ar.add(temp.right);
                       op[k] = temp.val;    k++;
                   }
               }
            }
            
            return ans;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    }
    
    
    
    // Weekly Contest 342
    
    public int findMin(int cnt[], int x) {
        int val = 0;
        for(int i = 0 ; i < 101 ; i++) {
            val += cnt[i];
            if(val >= x){
                return Math.max(0, (i - 50));
            }
        }
        return 0;
    }
            
    public int[] getSubarrayBeauty(int[] ar, int k, int x) {
        int cnt[] = new int[101];
        for(int i = 0 ; i < k ; i++) {
            cnt[ar[i] + 50]++;
        }
        
        int op[] = new int[ar.length];
        int index = 0;
        for(int i = k-1, j = 0 ; i < ar.length ; i++, j++) {
            op[index++] = findMin(cnt, x);
            cnt[ar[j] + 50]--;
            cnt[ar[i] + 50]++;
        }
        
        return op;
    }
    
    
    
    public int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }
    
    public int minOperations(int[] ar) {
        int n = ar.length;
        boolean flag = false, isOne = false;
        for(int i = 0 ; i < n ; i++) {
            if(ar[i] == 1) {
                isOne = true;
            }
        }
        int cnt = 0;
        if(!isOne) {
            for(int i = 0 ; i < n ; i++) {
                for(int j = i+1 ; j < n ; j++) {
                    if(gcd(ar[i], ar[j]) == 1) {
                        flag = true;
                        break;
                    }
                }
                if(flag) break;
            }
        }
        
        if(!isOne && !flag) {
            
            return -1;
        }
        
        for(int i = 0 ; i < n ; i++) {
            if(ar[i] != 1)  cnt++;
        }
        
        return cnt;
    }
    
    
    
    
    
    
    
    
    
    
    
    // leetcode biweekly 103
    
    
    public int findMaxFish(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        
        boolean v[][] = new boolean[r][c];
        
        int max = -1;
        for(int i = 0 ; i < r ; i++) {
            for(int j = 0 ; j < c ; j++) {
                if(mat[i][j] >= 1 && !v[i][j]) {
                    max = Math.max(max, DFS(i, j, r, c, v));
                }
            }
        }
        
        return max;
    }
    
    
    int DFS(int i, int j, int r, int c, boolean v[][]) {
        v[i][j] = true;
        int x[] = {0, 0, 1, -1};
        int y[] = {-1, 1, 0, 0};
        
        int sum = 0;
        for(int k = 0 ; k < 4 ; k++) {
            int _x = i + x[k];
            int _y = j + y[k];
            if(_x >= 0 && _x < r && _y >= 0 && _y < c && v[_x][_y] == false)  {
                sum += DFS(_x, _y, r, c, v);
            }
        }
        
        return sum;
    }
    
    
    
    
    
    
    public long countOperationsToEmptyArray(int[] ar) {
        int idx[] = new int[100000];
        int n = ar.length;
        
        int t[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            idx[ar[i]] = i;
            t[i] = ar[i];
        }
        
        Arrays.sort(ar);
        
        int val = idx[t[0]];
        
        for(int i = 1 ; i < n ; i++) {
            int cur = idx[t[i]];
            int pre = idx[t[i-1]];
            
            if(cur > pre) {
                
            }
            else {
                
            }
        }
        
        return 1l;
    }
    
    
    
    // weekly 343
    
    
    
    public int firstCompleteIndex(int[] ar, int[][] mat) {
        HashMap<Integer, int []> map = new HashMap<>();
        int r = mat.length;
        int c = mat[0].length;
        for(int i = 0 ; i < r ; i++) {
            for(int j = 0 ; j < c ; j++) {
                map.put(mat[i][j], new int[] {i, j} );
            }
        }
        
        int row[] = new int[r];
        int col[] = new int[c];
        
        for(int i = 0 ; i < ar.length ; i++) {
            int val = ar[i];
            int t[] = map.get(val);
            
            row[t[0]]++;
            col[t[1]]++;
            
            if(row[t[0]] == r || col[t[1]] == c)    return i;
        }
        
        return 0;
    }
    
    
    int rec(int index, int sr[][], int dp[], int endx, int endy) {
        
        // if end
        if(sr[index][0] == endx && sr[index][1] == endy)    return 0;
        if(sr[index][2] == endx && sr[index][3] == endy)    return sr[index][4];
        
        if(dp[index] != -1) return dp[index];
        int min = Integer.MAX_VALUE;
        for(int i = index + 1 ; i < sr.length ; i++) {
            
            
            // cost of from 1 sr to another sr
            int c = Math.abs(sr[i][0] - sr[index][0]) + Math.abs(sr[i][1] - sr[index][1]);
            
            
            // pick
            dp[i] = rec(i, sr, dp, endx, endy);//, sr[index][2], sr[index][3]);
            
            // not pick
            int not_pick = Math.abs(endx - sr[index][2]) + Math.abs(endy - sr[index][3]);
            
            System.out.println("in rec"+" : "+i+" cost : "+c+" dp : "+dp[i]+" notpick "+not_pick);
//            dp[i] = Math.min(dp[i], _c);
            min = Math.min(min, Math.min(not_pick, dp[i] + c));
        }
        
        return min;
    }
    
    
    public int minimumCost(int[] s, int[] t, int[][] sr) {
        int dp[] = new int[sr.length];
        Arrays.fill(dp, -1);
        
        int ans = Math.abs(s[1] - s[0]) + Math.abs(t[1] - t[0]);
        for(int i = 0 ; i < sr.length ; i++) {
            int c = Math.abs(sr[i][0] - s[0]) + Math.abs(sr[i][1] - s[1]);
            System.out.println("in main : "+i+" : "+c);
            dp[i] = rec(i, sr, dp, t[0], t[1]);
            
            ans = Math.min(ans, dp[i] + c);
        }
        
        return ans;
    }
    
    
    
    public static int powerfullInteger(int n, int ar[][], int k)
    {
        // int[] = {point, action}
        Queue<int []> pq = new PriorityQueue<>( (int a[], int b[]) -> {
            if(a[0] == b[0]) {
                // no swap
                if(a[1] == 1)   return -1;
                else return 1;
            }
            return a[0] - b[0];
        });           
                
        for(int i = 0 ; i < n ; i++) {
            pq.add(new int[] {ar[i][0], 1});
            pq.add(new int[] {ar[i][1], -1});
        }
        
        int cnt = 0;
        int ans = -1;
        while(!pq.isEmpty()) {
            int t[] = pq.remove();
            System.out.println(t[0]+" "+t[1]);
            if(t[1] == -1) {
                cnt--;
            }
            else {
                cnt++;
                
            }
            
            if(cnt >= k) {
                ans = t[0];
            }
        }
        
        return ans;
    }
    
    
    
}
