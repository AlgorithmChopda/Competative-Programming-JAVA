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
 * @author Vinay Chopda
 */
public class LeetCode_Graph_133 {
    public static void main(String args[]){

    }
}

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null)
            return null;
        
        Node ar[] = new Node[102];
        Node root = new Node(node.val);
                
        DFS(node, root, ar);
        return root;
    }
    
    public void DFS(Node copy, Node cur, Node ar[]){
        ar[copy.val] = cur;
        for(Node ele : copy.neighbors){
            if(ar[ele.val] == null){
                Node temp = new Node(ele.val);
                cur.neighbors.add(temp);
                DFS(ele, temp, ar);
            }
            else
                cur.neighbors.add(ar[ele.val]);
        }
    }
    
}
