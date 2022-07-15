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
 * @author Vinay Chopda
 */
public class DFS {    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n Enter the No of Edges : ");
        int edges = sc.nextInt();
        
        ArrayList<Integer> ar[] = new ArrayList[edges];
        for(int i = 0 ; i < edges ; i++)
            ar[i] = (new ArrayList<>());
        
        for(int i = 0 ; i < edges ; i++){
            int u = sc.nextInt();   int v = sc.nextInt();
            ar[u-1].add(v-1);
            ar[v-1].add(u-1);   //for undirected graph
        }
      
        boolean visited[] = new boolean[edges];
        System.out.println("\n DFS : ");
        DFS(ar, edges, visited, 1);
    }   

    public static void DFS(ArrayList<Integer>[] ar, int edges, boolean[] visited, int ele) {
        System.out.print((ele+1)+" ");
        visited[ele] = true;
        for(int i = 0 ; i < ar[ele].size() ; i++)
            if(!visited[ar[ele].get(i)])
                DFS(ar, edges, visited, ar[ele].get(i));
    }
}
