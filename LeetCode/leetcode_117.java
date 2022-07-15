/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Vinay Jain
 */
public class leetcode_117 {
    
    class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
    };
    
    
    class Solution {
    public Node connect(Node root) {
        Queue q = levelOrderTraversal(root);
        
        Node prev = null;
        while(!q.isEmpty()){
            Node cur = (Node) q.remove();
            if(cur.val == 101){
                prev = null;
                continue;
            }
            if(prev != null)
                prev.next = cur;
            prev = cur;
        }
        prev.next = null;
        return new Node();
    }

    private Queue levelOrderTraversal(Node root) {
        Queue q = new LinkedList<Node>();
        Queue data = new LinkedList<Node>();
        
        q.add(root);
        q.add(new Node(101));
        
        while(!q.isEmpty()){
            Node cur = (Node) q.remove();
            data.add(cur);
            
            if(cur.val == 101)
                q.add(new Node(101));
            
            if(cur.left != null)
                q.add(cur.left);
            if(cur.right != null)
                q.add(cur.right);
        }
        
        return data;
    }
    
  }
}