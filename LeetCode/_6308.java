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
public class _6308 {
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode end = new TreeNode(-1);
        ArrayList<Long> ar = new ArrayList<>();
        
        q.add(root);    q.add(end);
        long curSum = 0;
        while(!q.isEmpty()){
            TreeNode temp = q.remove();
            if(temp.val == -1){
                ar.add(curSum);
                curSum = 0;
                if(q.isEmpty())
                    break;
                q.add(end);
            }
            
            curSum += temp.val;
            if(temp.left != null){
                q.add(temp.left);
            } 
            if(temp.right != null){
                q.add(temp.right);
            }
        }
        
        return 0;
    }
}
