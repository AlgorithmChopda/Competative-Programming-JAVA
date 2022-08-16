/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vinay Jain
 */
public class _894_allpossibleFBT {
    
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
        public List<TreeNode> allPossibleFBT(int n) {
            return new ArrayList<TreeNode>();
        }
    }
    
    public static void main(String args[]){

    }
    
}
