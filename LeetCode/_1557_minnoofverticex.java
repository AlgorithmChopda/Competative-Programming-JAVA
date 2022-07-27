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
public class _1557_minnoofverticex {
    public static void main(String args[]){
        
    }
    class Solution {
        public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
            ArrayList<Integer> op = new ArrayList<Integer>();
            boolean ar[] = new boolean[n+2];
            for(int i = 0 ; i < edges.size() ; i++){
                ar[edges.get(i).get(1)] = false;
                System.out.println(" "+edges.get(i).get(1)+" made false");
            }
            for(int i = 0 ; i < n; i++)
                if(ar[i])    
                    op.add(i);
            return op;        
        }
    }
}
