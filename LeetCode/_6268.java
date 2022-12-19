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
public class _6268 {
    public int[] cycleLengthQueries(int n, int[][] q) {
        for(int i = 0 ; i < q.length ; i++){
            int u = q[i][0];
            int v = q[i][1];
            
            int _u = u;
            int _v = v;
            
            int length = 0;
            
            while(u != v){
                if(u > v){
                    u /= 2;
                }
                else{
                    v /= 2;
                }                
                length++;
            }
            length++;
            
            System.out.println(length);
        }
        
        return new int[0];
    }
}
