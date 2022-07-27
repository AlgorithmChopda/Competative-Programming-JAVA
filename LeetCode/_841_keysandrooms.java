/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.List;

/**
 *
 * @author Vinay Jain
 */
public class _841_keysandrooms {    
    class Solution {
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            boolean ar[] = new boolean[rooms.size()+1];
            ar[0] = true;
            DFS(ar, rooms.get(0), rooms);
            
            for(int i = 0 ; i < rooms.size()+1 ; i++)
                if(!ar[i])
                    return false;
            
            return true;
        }
        
        private void DFS(boolean[] ar, List<Integer> get, List<List<Integer>> rooms) {
            for(Integer i : get){
                if(!ar[i]){
                    ar[i] = true;
                    DFS(ar, rooms.get(i), rooms);
                }   
            }
        }
        
    }
}
