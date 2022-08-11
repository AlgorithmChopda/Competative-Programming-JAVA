/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class _6141_mergesimilaritems {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
    }
    
    class Solution {
        public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
           Arrays.sort(items1, (a, b) -> a[0] - b[0]);
           Arrays.sort(items2, (a, b) -> a[0] - b[0]);
           List<List<Integer>> ar= new ArrayList<>();
           
        int i = 0, j = 0;
        
        while(i < items1.length && j < items2.length){
            if(items1[i][0] == items2[i][0]){
                ar.add(new ArrayList<>(Arrays.asList(items1[i][0], (items1[i][1] + items2[i][1]))));
                i++;    j++;
            }
            
            if(items1[i][0] < items2[i][0]){
                ar.add(new ArrayList<>(Arrays.asList(items1[i][0], items1[i][1])));
                i++;
            }
            
            else{
                ar.add(new ArrayList<>(Arrays.asList(items2[i][0], items2[i][1])));
                j++;
            }
            
        }
           
        
        while(i < items1.length){
            ar.add(new ArrayList<>(Arrays.asList(items1[i][0], items1[i][1])));
            i++;
        }
        
        while(j < items2.length){
            ar.add(new ArrayList<>(Arrays.asList(items2[i][0], items2[i][1])));
            j++;
        }
        
           return ar;
        }
    }
    
}
