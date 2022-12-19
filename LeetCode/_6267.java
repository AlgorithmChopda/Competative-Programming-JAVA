/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Vinay Jain
 */
public class _6267 {
        public boolean isPossible(int n, List<List<Integer>> e) {
            HashSet<Integer> g[] = new HashSet[n];
            for(int i = 0 ; i < e.size() ; i++){
                int u = e.get(i).get(0);
                int v = e.get(i).get(1);

                g[u].add(v);
                g[v].add(u);
            }

            int cnt = 0;
            int ar[] = new int[5];
            int k = 0;
            for(int i = 0 ; i < n ; i++){
                if(g[i].size() % 2 != 0){
                    cnt++;
                    if(cnt > 4) return false;
                    ar[k++] = i;    // ith node has odd degree
                }
            }

            int i = 0;
            if(cnt == 0)    return true;
            if(cnt == 1 || cnt == 3)    return false;
            if(cnt == 2){            
                if(g[ar[i]].contains(ar[i+1]) == false) return true;
                return false;
            }
            if(cnt == 4){   
                    if(g[ar[i]].contains(ar[i+1]) == false && g[ar[i+2]].contains(ar[i+3]) == false)    
                        return true;
                    if(g[ar[i]].contains(ar[i+2]) == false && g[ar[i+1]].contains(ar[i+3]) == false)    
                        return true;
                    if(g[ar[i]].contains(ar[i+3]) == false && g[ar[i+1]].contains(ar[i+2]) == false)    
                        return true;

            }    

            return false;
        }
}
