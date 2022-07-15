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
public class Topological_Sort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n Enter the No of Edges : ");
        int edges = sc.nextInt();
        
        ArrayList<Integer> ar[] = new ArrayList[edges];
        for(int i = 0 ; i < edges ; i++)
            ar[i] = (new ArrayList<>());
        
        for(int i = 0 ; i < edges ; i++){
            int u = sc.nextInt();   int v = sc.nextInt();
            ar[u].add(v);
        }
        
        boolean visited[] = new boolean[edges];
        ArrayList<Integer> op = new ArrayList<>();
        for(int i = 0 ; i < edges ; i++)
            if(!visited[i])
                TopologicalSort(i, ar, visited, op);
        System.out.println("\n"+op);
    }

    public static void TopologicalSort(int start, ArrayList<Integer>[] ar, boolean visited[], ArrayList<Integer> op){
        // assuming it's a Directed Graph
        visited[start] = true;
        for(Integer next : ar[start])
            if(!visited[next])
                TopologicalSort(next, ar, visited, op);
        op.add(start);
    }
}
