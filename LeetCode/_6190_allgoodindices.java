/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author Vinay Jain
 */
public class _6190_allgoodindices {
    /*class Solution {
        public List<Integer> goodIndices(int[] nums, int k) {
            
        }
    }*/
    
    public static void main(String args[]){
        int ar[] = {2,1,1,1,3,4,1};
        int k = 2, ei = ar.length - k;
        
        int c = 0, fi = k+2;
        boolean right[] = new boolean[ar.length];
        while(fi < ar.length){
            if(c == k-1){
                System.out.println("\n found "+fi);
                right[fi - k - 1] = true;
                c--;
            }
            
            if(ar[fi] > ar[fi-1])
                c++;
            else
                c = 0;
            fi++;
        }
        
        for(boolean b : right)
            System.out.print(b+" ");
        
    }
            
}
