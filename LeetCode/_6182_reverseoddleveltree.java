/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Vinay Jain
 */
public class _6182_reverseoddleveltree {
    class Solution {
        
        class TreeNode{
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
        
        public void BFS_Helper(TreeNode root){
            boolean flag = true;
            // true = even, false = odd;
            
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            q.add(new TreeNode(-1));
            
            ArrayList<TreeNode> ar = new ArrayList<>();
            
            while(!q.isEmpty()){
                
                TreeNode ele = q.remove();
                if(ele.val == -1){
                    
                    if(ar.size() > 1){
                        for(int i = 0 , j = ar.size() - 1 ; i < j ; i++, j--){
                            int temp = ar.get(i).val;
                            ar.get(i).val = ar.get(j).val;
                            ar.get(j).val = temp;
                        }
                    }
                    
                    ar.clear();
                    flag = (!flag);
                    if(q.size() != 0)
                        q.add(ele);
                    
                    continue;
                }
                
                if(ele.left != null)
                    q.add(ele.left);
                if(ele.right != null)
                    q.add(ele.right);
                
                if(!flag)
                    ar.add(ele);
            }
            
        }
        
        public TreeNode reverseOddLevels(TreeNode root) {
            BFS_Helper(root);
            return root;
        }
    }
}
