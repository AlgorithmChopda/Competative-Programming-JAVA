/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Arrays;
import java.util.LinkedList;
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
    
}
