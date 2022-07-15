/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Vinay Jain
 */
public class leetcode_399 {
    public static void main(String args[]){

    }
    
    
    /* --------------------------- */
    class Solution {

        
        double query_val = -2;
        
        class Node{
            double key;
            String dest;
        
            public Node(String dest, double key){
                this.dest = dest;
                this.key = key;
            }
        }
    
        public double[] calcEquation(List<List<String>> equations, double[] values, 
        List<List<String>> queries) 
        {
            HashMap<String, List<Node>> hs = new HashMap();
            for(int i = 0 ; i < values.length ; i++){
                String src = equations.get(i).get(0);
                String dest = equations.get(i).get(1);
                
                hs.putIfAbsent(src, new ArrayList());
                hs.putIfAbsent(dest, new ArrayList());
                
                hs.get(src).add(new Node(dest, values[i]));
                hs.get(dest).add(new Node(src, (1/values[i]) ));
            }
            
            double result[] = new double[queries.size()];
            
            for(int i = 0 ; i < queries.size(); i++){
                query_val = -2;
                answerQuery(hs, queries.get(i).get(0), queries.get(i).get(1));
                if(query_val == -2)
                    result[i] = -1.0;
                else
                    result[i] = query_val;
            }
            
            return result;
        }
        
        private void answerQuery(HashMap<String, List<Node>> hs, String a, String b) {
            if(!hs.containsKey(a) || !hs.containsKey(b)){
                query_val =  -1.0;
                return;
            }
            if(a.equals(b)){
                query_val = 1.0;
                return;
            }
            
            HashSet<String> visited = new HashSet();
            DFS(hs, a, visited, b);
        }
        
        public boolean DFS(HashMap<String, List<Node>> hs, String src,HashSet<String> visited, String a_dest)    {
            
            if(src.equals(a_dest)){
                query_val = 1;
                return true;
            }
            visited.add(src);
            for(Node nei : hs.get(src)){
                if(!visited.contains(nei.dest)){
                    if(DFS(hs, nei.dest, visited, a_dest)){
                        query_val *= nei.key;
                        return true;
                    }
                }
            }
                
            return false;
        }
    }


    
    /* --------------------------- */
    
}


