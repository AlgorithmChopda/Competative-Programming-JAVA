/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.Arrays;

/**
 *
 * @author Vinay Jain
 */
public class _2 {
    public static void main(String args[]){
        int ar[] = {7, 10, 4, 3, 20, 15};
        int k = 3;
        
        Arrays.sort(ar);
        System.out.println(ar[k-1]); 
    }
}
