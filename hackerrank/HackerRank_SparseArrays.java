/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Vinay Chopda
 */
public class HackerRank_SparseArrays {
    public static void main(String args[]){
        
        List<String> strings = new ArrayList<>();
        strings.add("aba");
        strings.add("baba");
        strings.add("aba");
        strings.add("xzxb");
         
        List<String> queries = new ArrayList<>();
        queries.add("aba");
        queries.add("xzxb");
        queries.add("ab");
        
        List<Integer> res = matchingStrings(strings, queries);
        for (int i = 0; i < res.size(); i++) 
           System.out.println("\n "+res.get(i));
    }
    
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) 
    {
        HashMap<String,Integer> hs = new HashMap<>();
        for(String string : strings) {
            if (!hs.containsKey(string)) {
                hs.put(string, 1);
            } else {
                hs.put(string, hs.get(string) + 1);
            }   
        }
        ArrayList<Integer> ar = new ArrayList<>();
        for (String querie : queries) {
            if (hs.containsKey(querie)) {
                ar.add(hs.get(querie));
            } else {
                ar.add(0);
            }
        }
        return ar;   
    }
}
