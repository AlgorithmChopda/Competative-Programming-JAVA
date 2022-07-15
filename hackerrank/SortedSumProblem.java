/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Vinay Chopda
 */
public class SortedSumProblem 
{

    public static void main(String args[]){
        List<Integer> a = new ArrayList<Integer>();
        a.add(9);
        a.add(5);
        a.add(8);
        
        SortedSumProblem.sortedSum(a);
        
    }
    
    public static int sortedSum(List<Integer> a) {
        int sum = a.get(0);
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(a.get(0));
        
        for(int i = 1 ; i < a.size() ; i++){
            ar.add(a.get(i));
            Collections.sort(ar);
            
            int val = 0;
            for(int j = 0 , k = 1; j < ar.size() ; j++ ,k++){
                val = k * ar.get(j) + val;
                System.out.println("\n val = "+val);
            }
            sum += val;   
            //System.out.println("val = "+val);       
            System.out.println("sum = "+sum);       
        }
        return (sum);
//% 10^9 + 7);
    }

    
    
}
