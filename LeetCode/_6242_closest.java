/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class _6242_closest {
   
    public void tra(TreeNode root, ArrayList<Integer> ar) {
        if(root == null)
            return;
        tra(root.left, ar);
        ar.add(root.val);
        tra(root.right, ar);
    }
     public class TreeNode {
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
    
    static class Solution {
        public void solve(Scanner sc){
            
        }
    }

    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> q) {
        List<List<Integer>> op = new ArrayList<>();
        ArrayList<Integer> ar = new ArrayList<>();
        tra(root, ar);
        for(Integer ele : q){
            int l = 0, h = ar.size();
            int max = Integer.MAX_VALUE, min = Integer.MIN_VALUE;
            while(l <= h){
                int mid = (l + h ) / 2;
                if(ar.get(mid) == ele){
                    max = ele; min = ele;
                    break;
                }
                else{
                    if(ar.get(mid) > ele){
                        max = Math.min(max, ar.get(mid));
                        h = mid - 1;
                    }
                    else{
                        min = Math.max(min, ar.get(mid));
                        l = mid+1;
                    }
                }
            }
            
            if(max == Integer.MAX_VALUE)
                max = -1;
            if(min == Integer.MIN_VALUE)
                min = -1;
            
            op.add(new ArrayList<>(Arrays.asList(min, max)));
        }
        
        return op;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
