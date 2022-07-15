/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Vinay Chopda
 */

class Edge
{
    int dest, wi;
    public Edge(int dest, int wi){
        this.dest = dest;
        this.wi = wi;
    }
}

public class Dijkartas_Shortestpathalgorithm {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the No of edges and vertices : ");
       
        int edges = sc.nextInt();
        int v = sc.nextInt();
        ArrayList<Edge> ar[] = new ArrayList[v];
        
        for(int i = 0 ; i < v ; i++)
            ar[i] = new ArrayList<>();
        
        for(int i = 0 ; i < edges ; i++){
            int source = sc.nextInt();
            int dest = sc.nextInt();
            int weight = sc.nextInt();
            
            ar[source].add(new Edge(dest, weight));
        }
        
        System.out.println("\n Enter source : ");
        int sr = sc.nextInt();
        
        Queue q = new PriorityQueue<>();
        HashSet<Integer> hs = new HashSet<>();
        
        int distance[] = new int[v];
        distance[sr] = 0;
        
        for(int i = 0 ; i < v ; i++){
            if(i != sr)
                distance[i] = Integer.MAX_VALUE;
            q.add(i);
        }
       
        while(!q.isEmpty()){
            int vertex = (int) q.remove();
            hs.add(vertex);
            System.out.println("veter : "+vertex+" cost : "+distance[vertex]);
            for(Edge e : ar[vertex]){
                if(!hs.contains(e.dest)){
                    distance[e.dest] = Math.min(distance[e.dest], distance[vertex] + e.wi);
                    q.add(e.dest);
                }
            }
        }
        
    }
}
