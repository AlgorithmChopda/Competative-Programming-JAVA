/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Vinay Jain
 */

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
public class _652 {
        List<TreeNode> op = new ArrayList<>();
    public String traverseTree(TreeNode root, HashMap<String, Boolean> map){ 
        String s1 = "", s2 = "";
        if(root.left == null)
            s1 = "N";
        else
            s1 = traverseTree(root.left, map);
        
        if(root.right == null)
            s2 = "N";
        else
            s2 = traverseTree(root.right, map);
        String str = s1 + Integer.toString(root.val) + s2;
        
        // if this serialization is present
        if(map.containsKey(str)){
            if(map.get(str) == false){
                op.add(root);
                map.put(str, true);
            }
        }
        else{
            map.put(str, false);
        }
        
        return str;
    }

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        HashMap<String, Boolean> map = new HashMap<>();
        traverseTree(root, map);
        return op;
//        for(Map.Entry<Integer, ArrayList<TreeNode>> key : map.entrySet()){
//                System.out.println(key.getKey()+" -> "+map.get(key.getKey()) );
//        }        
    }
}
