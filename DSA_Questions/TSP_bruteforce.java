/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class TSP_bruteforce {
    
    static int cost[][] = {{0, 4, 12, 7},
                        {10, 0, 35, 25},
                        {15, 35, 0, 30},
                        {20, 25, 30, 0}    };
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n No of Cities : ");
        int n = sc.nextInt();
        
        //cost = new int[n][n];
        
        // initially source as 1st city
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> final_op = new ArrayList<>(); 
        
        for(int i = 1 ; i < n ; i++){
            
            boolean visited[] = new boolean[n];
            ArrayList<Integer> op = new ArrayList<>();
            op.add(0);  op.add(i);
            visited[0] = true;  visited[i] = true;
            
            int value = cost[0][i] + function(i, n, visited, op);
            if(min > value)
                final_op = new ArrayList<>(op);
            
        }
     
        System.out.print(" 0 ");
        for(int i = 1 ; i < n ; i++){
            System.out.print(" -->  "+final_op.get(i));
        }
        System.out.println(min);
    }

    static int function(int city, int n, boolean[] visited, ArrayList<Integer> op) {
        
        int min = Integer.MAX_VALUE;
        int index = -1, j = 0;
        
        for(j = 0 ; j < n ; j++){
            if(!visited[j])
                break;
        }
        
        // if all the cities are visited
        if(j == n){
            op.add(0);
            return cost[city][0];
        }
        
        for(int i = 0 ; i < n ; i++){
            if(visited[i] == false){
                visited[i] = true;
                int value = cost[city][i] + function(i, n , visited, op);
                
                if(min > value){
                    index = i;
                    min = value;
                }
                visited[i] = false;
            }
        }
        
        op.add(index);
        return min;
    }
}
