/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import javafx.util.Pair;

/**
 *
 * @author Vinay Jain
 */
public class _6221 {
    static class Solution {
        
        public void hc(HashMap<String, Pair<String, Integer>> hs, String name, String vname, int view){
            if(!hs.containsKey(name)){
                hs.put(name, new Pair(vname, view));
                return; 
            }
            if(hs.get(name).getValue() < view){
                hs.put(name, new Pair(vname, view));
            }
            else{
                if(hs.get(name).getValue() == view){
                    String v1 = hs.get(name).getKey();
                    int val = v1.compareTo(vname);
                    if(val >= 0){
                        hs.put(name, new Pair(vname, view));
                    }
                }
            }
        }
        public List<List<String>> solve(Scanner sc){
            String c[] = {"a", "a"} , id[] = {"a", "a"};
            int v[] = {2, 2};
            HashMap<String, Long> p = new HashMap<>();
            HashMap<String, Pair<String, Integer>> video = new HashMap<>();
            List<List<String>> op = new ArrayList<>();
            
            long max = -1;
            for(int i = 0 ; i < c.length ; i++){
                if(p.containsKey(c[i])){
                    p.put(c[i], p.get(c[i]) + v[i]);
                    max = Math.max(max, p.get(c[i]));
                }
                else{
                    p.put(c[i], (long) v[i]);
                    max = Math.max(max, v[i]);
                }
                
                hc(video, c[i], id[i], v[i]);
            }
            
            
            System.out.println("\n "+Arrays.asList(p));
            System.out.println("\n "+Arrays.asList(video));
            HashSet<String> done = new HashSet<>();
            
            for (String c1 : c) {
                if ( !done.contains(c1) && p.get(c1) == max) {
                    op.add(new ArrayList<>(Arrays.asList(c1, video.get(c1).getKey())));
                    done.add(c1);
                }
            }
            
            System.out.println("\n "+Arrays.asList(op));
            return op;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
