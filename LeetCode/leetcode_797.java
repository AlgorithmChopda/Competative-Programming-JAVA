package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinay Chopda
 */
public class leetcode_797 {
    
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;
        ArrayList<Integer> ar[] = new ArrayList[n];
        for(int i = 0 ; i < n ; i++)
            ar[i] = (new ArrayList<>());
        for(int i = 0 ; i < graph.length ; i++){
            for(int j = 0 ; j < graph[i].length ; j++){
                ar[i].add(graph[i][j]); 
            }
        }
        
        LinkedList<Integer> op = new LinkedList<>();
        List<List<Integer>> ls = new ArrayList<>();
        DFS(ls, ar, 0, n-1, op);
 
        return ls;
    }
    
    public static void main(String args[]){
        

    }

    public static void DFS(List<List<Integer>> ls , ArrayList<Integer>[] ar, int i, int dest, LinkedList<Integer> op) {
        if(i == dest){
            op.add(dest);
            ls.add(new ArrayList<>(op));
            return;
        }
        op.add(i);
        for(int j = 0 ; j < ar[i].size() ; j++){
            DFS(ls, ar, ar[i].get(j), dest, op);
            op.removeLast();
        }
    }
}
