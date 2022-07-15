/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Vinay Chopda
 */
public class BFS {
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
        System.out.println("\n BFS : ");
        BFS(ar, edges);
    }   

    public static void BFS(ArrayList<Integer>[] ar, int edges) {
        boolean visited[] = new boolean[edges];
        LinkedList<Integer> queue = new LinkedList<>();
        /* 
            because queue is an interface in java we can use priority queue instead by time
            complexity is log(n) for enqueue and dequeue so linkedlist is used o(1) insert and 
            delete
        */
        
        queue.add(0);
        visited[0] = true;
        while(!queue.isEmpty()){
            int ele = queue.remove();
            System.out.print((ele+1)+" ");
            for(int next_vertex : ar[ele]){
                if(!visited[next_vertex]){
                    queue.add(next_vertex);
                    visited[next_vertex] = true;
                }
            }
        }
     
    }
}
