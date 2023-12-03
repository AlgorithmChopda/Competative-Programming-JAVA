/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;

/**
 *
 * @author Vinay Jain
 */
public class Weekly_370 {
    public int findChampion(int n, int[][] edges) {
        int cnt[] = new int[n];
        for(int i[] : edges) {
            cnt[i[1]]++;
        }
        
        boolean found = false;
        int ans = 0;
        for(int i = 0 ; i < n ; i++) {
            if(cnt[i] == 0)  {
                if(found)   return -1;
                found = true;
                ans = i;
            }
        }
        
        return ans;
    }
    class Node {
        int data;
        ArrayList<Integer> child;
        
        public Node(int data) {
            this.data = data;
            child = new ArrayList<>();
        }
    }
    
//    Node ar[];
    boolean isLeaf(int node) {
        return true;
    }
    long rec(int node) {
        return 0;
    }
    
    class Data {
        long maxSum, bestSum;
        Data(long maxSum, long bestSum) {
            this.maxSum = maxSum;
            this.bestSum = bestSum;
        }
    }
    
    ArrayList<int []> ar[];
    int val[];
    public long maximumScoreAfterOperations(int[][] e, int[] temp) {
//        int n = val.length;
//        ar = new Node[n];
//        for(int i : val) {
//            ar[i] = new Node(i);
//        }
//        
//        for(int i[] : e) {
//            ar[i[0]].child.add(i[1]);
//        }
        
        int n = temp.length;
        val = new int[n];
        for(int i = 0 ; i < n ; i++) val[i] = temp[i];
        
        ar = new ArrayList[n];
        for(int i = 0 ; i < n ; i++) ar[i] = new ArrayList<>();
       
        boolean check[] = new boolean[n];
        for(int i[] : e) {
            ar[i[0]].add(new int[] {i[1], val[i[1]]});
            ar[i[1]].add(new int[] {i[0], val[i[0]]});
            check[i[1]] = false;
        }
       
        Data res = DFS(0, val[0] * 1l, -1);
        
        return res.bestSum;
    }
    
    
    Data DFS(int node, long data, int parent) {
        // if leaf
        if(ar[node].size() == 1 && node != 0) {
            return new Data(data,0l);
        }
        
        long bestSum = 0, maxSum = 0;
        for(int ch[] : ar[node]) {
            if(ch[0] == parent) continue;
            Data temp = DFS(ch[0], ch[1] * 1l, node);
            bestSum += temp.bestSum;
            maxSum += temp.maxSum;
        }
        
         
        if(maxSum > bestSum + data) {
            return new Data(maxSum + data, maxSum);
        }
       
        return new Data(maxSum + data, bestSum + data);
    }
}
