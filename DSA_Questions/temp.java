/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Vinay Chopda
 */
public class temp {
     public static void main(String args[]){
         List<List<Integer>> op = new ArrayList<>();
        //op.get(0).remove(6);
         int ar[] = new int[10];
         for(int i = 0 ; i < ar.length ; i++){
             for(int j = i ; j < ar.length ; j++){
                 int ar1[] = Arrays.copyOfRange(ar, i, j);
                 ArrayList<Integer> ar12 = new ArrayList<>();
                 ArrayList<Integer> ar132 = new ArrayList<>(ar12);
                 //op.add(new ArrayList<>(Arrays.asList(Arrays.copyOfRange(ar, i, j))));
             }
         }
                 
    }
}
