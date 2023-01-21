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
public class _3 {
    public static void main(String args[]){
        int ar[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        Arrays.sort(ar);
        for(int i : ar)
            System.out.print(i+" ");
        System.out.println("\n");
    }
}
