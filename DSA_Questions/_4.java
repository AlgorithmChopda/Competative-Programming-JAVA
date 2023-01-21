/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.HashSet;

/**
 *
 * @author Vinay Jain
 */
public class _4 {
    public static void main(String args[]){
        int ar1[] = {1, 3, 4, 5, 7};
        int ar2[] = {2, 3, 5, 6};
        
        HashSet<Integer> map = new HashSet<>();
        
        System.out.println("\n Union : ");
        for(int i : ar1){
            if(!map.contains(i))
                System.out.print(i+" ");
            map.add(i);
        }
        
        for(int j : ar2){
            if(!map.contains(j))
                System.out.print(j+" ");
            map.add(j);
        }
        
        System.out.println("\n Intersection");
        
        map.clear();
        for(int i : ar1)
            map.add(i);
        
        for(int j : ar2){
            if(map.contains(j))
                System.out.print(j+" ");
        }
        
    }
}
