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
}
