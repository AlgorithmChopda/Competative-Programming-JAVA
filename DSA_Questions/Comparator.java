/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.PriorityQueue;

/**
 *
 * @author Vinay Jain
 */
public class Comparator {
    public static void main(String args[]){
        int ar[] = new int[]{1,2,3,4,5,5};
        int ar1[] = new int[]{1,2,3,4,5,5};
//        Arrays.sort(ar, new Comparator<Integer>() );
//        Arrays.sort(ar, (int a, int b) -> a - b);
        
        
        // comparator in Priority Queue
        PriorityQueue<int []> q = new PriorityQueue<>( (a, b) -> {
            if(a[0] == b[0])    
                return a[1] - b[1];
            return a[0] - b[0];
        });

        // comparator in Arrays.sort
//        Arrays.sort(ar, Comparator. );
    }
}
