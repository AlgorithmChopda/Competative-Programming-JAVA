/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class problem_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int ar[] = new int[n];
        for(int i = 0 ; i < n ; i++)
            ar[i] = sc.nextInt();
        
        int index[] = new int[n];
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i = n-1 ; i >= 0 ; i--){
            if(hs.containsKey(ar[i]))
                index[i] = hs.get(ar[i]);
            else
                index[i] = -1;            
            hs.put(ar[i], i);
        }
        
        for(int i = 0 ; i < n ; i++)
            System.out.print(index[i]+" ");
        System.out.println();
        
        int max = -1;
        for(int i = 0 ; i < n ; i++)
            if(index[i] != -1)
                max = Math.max(i + n - index[i], max);
        
        if(max == -1)
            System.out.println("Weak Array");
        else
            System.out.println(max);
            
    }
}
