/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Vinay Chopda
 */
public class TRAVELLING {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int ver = sc.nextInt();
            int edges = sc.nextInt();
            ArrayList<HashSet<Integer>> ar = new ArrayList<>();
            ver++;
            
            for(int i = 1 ; i <= ver ; i++)
                ar.add(new HashSet<>());
        
            for(int i = 0 ; i < edges ; i++){
                int u = sc.nextInt();   int v = sc.nextInt();
                ar.get(u).add(v);
                ar.get(v).add(u);   //for undirected graph
            }
            
            if(edges == 0){
                System.out.println(ver - 1); 
                continue;
            }
            
            if(ver == 2){
                if(ar.get(1).contains(2))
                    System.out.println("0");
                else
                    System.out.println("1");
                continue;
            }
      
            int max[] = new int[2];
            boolean visited[] = new boolean[ver];
            DFS(ar, visited, 1, max);
            
            System.out.println("\n max : "+max[0]);
            
        }
    }
     public static void DFS(ArrayList<HashSet<Integer>> ar, boolean[] visited, int ele, int max[]){
        if(max[0] < ele)
            max[0] = ele;
        visited[ele] = true;
        for(Integer i : ar.get(ele)){
            if(!visited[i])
                DFS(ar, visited, i, max);
        }
        
    }
}
