/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Vinay Chopda
 */
public class test {
    
    public int[] findColumnWidth(int[][] grid) {
        int op[] = new int[grid[0].length];
        
        for(int i = 0 ; i < grid.length ; i++) {
            for(int j = 0 ; j < grid[i].length ; j++) {
                op[j] = Math.max(op[j], Integer.toString(grid[i][j]).length());
            }
        }
        
        return op;
    }
    
    public long[] findPrefixScore(int[] ar) {
        long op[] = new long[ar.length];
        long sum = 0;
        long max = 0;
        for(int i = 0 ; i < ar.length ; i++) {
            op[i] = ar[i] + sum + Math.max(ar[i], max);
            sum += (Math.max(ar[i], max) + ar[i]);
            max = Math.max(ar[i], max);
        }
        
        return op;
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
    
    void traverse(TreeNode root, int depth, HashMap<Integer, Integer> map) {
        if(root == null)    return;
        if(!map.containsKey(depth)) {
            map.put(depth, 0);
        }
        map.put(depth, map.get(depth) + root.val);
        traverse(root.left, depth+1, map);
        traverse(root.right, depth+1, map);
    }
    
    void t1(TreeNode root, int depth, HashMap<Integer, Integer> map, TreeNode temp) {
        if(root == null || temp == null || !map.containsKey(depth + 1)) return;
        // true = right 
        int val = map.get(depth + 1);
        if(root.left != null) {
            val -= root.left.val;
        }
        if(root.right != null) {
            val -= root.right.val;
        }
        
        TreeNode node = new TreeNode(val);
        if(root.left != null){
            temp.left = node;
        }
        if(root.right != null){
            temp.right = node;
        }
//        if(dir) {
//            temp.right = node;
//        }
//        else{
//            temp.left = node;
//        }
        
        t1(root.left, depth+1, map, temp.left);//, false);
        t1(root.right, depth+1, map, temp.right);//, true);
    }
    public TreeNode replaceValueInTree(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        traverse(root, 1, map);
        System.out.println(map);
        TreeNode head = new TreeNode(0);
        t1(root, 1, map, head);
        return root;
    }
    
    
class Graph {
    ArrayList<int []> ar[];
    int temp[][];
    int n;
    long ans = -1;
    public void calShortestPath() {
        for (int node = 0; node < n; node++) {
            for (int sr = 0; sr < n; sr++) {
                for (int de = 0; de < n; de++) {
                    if (temp[sr][node] + temp[node][de] < temp[sr][de]){
                        temp[sr][de] = temp[sr][node] + temp[node][de];
                    }
                    else{
                        // to do
                    }
                }
            }
        }
    }
    public Graph(int n, int[][] edges) {
        this.n = n;
        ar = new ArrayList[n];
        temp = new int[n][n];
        for(int i = 0 ; i < n ; i++) {
            ar[i] = new ArrayList<>();
        }
        
        for(int i = 0 ; i < edges.length ; i++) {
            ar[edges[i][0]].add(new int[] {edges[i][1], edges[i][2]} );
            temp[edges[i][0]][edges[i][1]] = edges[i][2];
        }
    }
    
    void dfs(int t, long sum, int index) {
        if(t == index) {
            ans = Math.min(ans, sum);
            return;
        }
        
        for(int[] node : ar[index]) {
            dfs(t, sum + node[1], node[0]);
        }
        
    }
    public void addEdge(int[] edge) {
        ar[edge[0]].add(new int[] {edge[1], edge[2]} );
        int src = edge[0];
        int dest = edge[1];
        int cost = edge[2];
        
        
    }
    
    public int shortestPath(int node1, int node2) {
        dfs(node2, 0, node1);
        long val = ans;
        ans = -1;
        return (int)val;
    }
}
    
    public static void main(String args[]) {
            String a = Integer.toString(-2);
            System.out.println(a);
    }
   
   
    
    //  weekly contest 341
    
    public int addMinimum(String word) {
        char ch[] = word.toCharArray();
        int cnt = 0;
        char check[] = new char[] {'a', 'b', 'c'};
        int k = 0, i = 0;
        while(i < ch.length) {
            if(check[k] == ch[i]) {
                i++;
            }
            else{
                cnt++;
            }
            k = (k + 1) % 3;
        }
        
        if(ch[ch.length - 1] == 'b') {
            cnt++;
        }
        if(ch[ch.length - 1] == 'a') {
            cnt += 2;
        }
        
        return cnt;
    }
    
    
    public int minimumTotalPrice(int n, int[][] e, int[] p, int[][] t) {
        ArrayList<Integer> ar[] = new ArrayList[n];
        for(int i = 0 ; i < n ; i++) {
            ar[i] = new ArrayList<>();
        }
        
        for(int a[] : e) {
            ar[a[0]].add(a[1]);
            ar[a[1]].add(a[0]);
        }
        
        return 0;
    }
    
}
