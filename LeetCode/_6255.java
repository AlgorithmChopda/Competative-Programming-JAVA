/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javafx.util.Pair;

/**
 *
 * @author Vinay Jain
 */
public class _6255 {
    static class Solution {
        public void solve(Scanner sc){
            
        }
        int min = Integer.MAX_VALUE;
        public int minScore(int n, int[][] r) {
            HashMap<Integer, ArrayList<Pair<Integer, Integer>> > g = new HashMap<>();
            for (int[] r1 : r) {
                if (g.containsKey(r1[0])) {
                    g.get(r1[0]).add(new Pair(r1[1], r1[2]));
                } else {
                    g.put(r1[0], new ArrayList<>());
                    g.get(r1[0]).add(new Pair(r1[1], r1[2]));
                }
                if (g.containsKey(r1[1])) {
                    g.get(r1[1]).add(new Pair(r1[0], r1[2]));
                } else {
                    g.put(r1[1], new ArrayList<>());
                    g.get(r1[1]).add(new Pair(r1[0], r1[2]));
                }
            }
            boolean v[] = new boolean[r.length];
            DFS(g, v, 1);
            return 0;
        }   

        public void DFS(HashMap<Integer, ArrayList<Pair<Integer, Integer>>> g, boolean[] v, int node)         
        {
            v[node] = true;
            for(Pair p : g.get(node)){
                if(!v[(Integer)p.getKey()]){
                    min = Math.min(min, (Integer)p.getValue());
                    DFS(g, v, (Integer)p.getKey());
                }
            }
            
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
