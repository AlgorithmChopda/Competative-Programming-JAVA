/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import javafx.util.Pair;

/**
 *
 * @author Vinay Chopda
 */

public class Graph_Representation {
    
    public static String source_vertex;
    // needs to be stored when using hash of hash because we are dealing with strings and not
    // integers so source vertex may not be the same every time 
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n Enter the No of Edges : ");
        int edges = sc.nextInt();
        
        int mat[][] = new int[1][1];
     
        
        // Representation Matrix
            //int mat[][] = new int[edges][edges];
            //representation_Matrix(mat, edges, sc);
        
         //Representation AdjList
            //ArrayList<Integer> ar[] = new ArrayList[edges];
            //representation_AdjList(ar, edges, sc);
       
        // Representation AdjHash
            //ArrayList<HashSet<Integer>> ar = new ArrayList<>();
            //representation_AdjHash(ar, edges, sc);
        
         //Representation Hash of Hash
            HashMap<String, ArrayList<String>> hm = new HashMap<>();
            representation_HashofHash(hm, edges, sc);
            HashSet<String> hs = new HashSet<>();
            DFS(hm, edges, hs, source_vertex);
            
    }
    
    
    /*
        insert = o(1);
        searching edge = o(1);
        traversing every edge from the current vertex : o(n);
        requires lot of space
    */
    public static void representation_Matrix(int mat[][], int edges, Scanner sc){
        for(int i = 0 ; i < edges ; i++){
            int u = sc.nextInt();   int v = sc.nextInt();
            mat[u-1][v-1] = 1;  // if edges starting from 1
            mat[v-1][u-1] = 1;  // if undirected graph
        }
        
        for(int i = 0 ; i < edges ; i++){
            System.out.print("\n "+(i+1)+" : ");
            for(int j = 0 ; j < edges ; j++){
                if(i == j)
                    continue;
                if(mat[i][j] == 1) // edges is present
                    System.out.print(" "+(j+1));
            }
        }
    }
    
    /*
        insert = o(1);
        space = no of edges
        searching for the edge from a vertex : o(no of edges from the current vertex);
    */
    public static void representation_AdjList(ArrayList<Integer> ar[], int edges, Scanner sc){
        /*
        System.out.println("\n Enter the No of Edges : ");
        int edges = sc.nextInt();
        
        ArrayList<Integer> ar[] = new ArrayList[edges];
        */
        for(int i = 0 ; i < edges ; i++)
            ar[i] = (new ArrayList<>());
        
        for(int i = 0 ; i < edges ; i++){
            int u = sc.nextInt();   int v = sc.nextInt();
            ar[u].add(v);
            ar[v].add(u);   //for bidirectional graph
        }
      
        for(int i = 0 ; i < edges ; i++){
            System.out.print("\n "+(i+1)+" : ");
            for(int j : ar[i])
                System.out.print(" "+(j+1));   
        }
    }
    
    /*
        insert = o(1);
        searching edge = o(n);
        space = no of edges
        cannot store strings;
    */
    public static void representation_AdjHash(ArrayList<HashSet<Integer>> ar, int edges, Scanner sc){
        //allocate memory for linkedlist
        System.out.println("\n Adj Hash : ");
        
        for(int i = 0 ; i < edges ; i++)
            ar.add(new HashSet<>());
        
        for(int i = 0 ; i < edges ; i++){
            int u = sc.nextInt();   int v = sc.nextInt();
            ar.get(u-1).add(v-1);
            ar.get(v-1).add(u-1);   //for undirected graph
        }
      
        for(int i = 0 ; i < edges ; i++){
            System.out.print("\n "+(i+1)+" : ");
            for(int j : ar.get(i))
                System.out.print(" "+(j+1));   
        }
    }
    
    // useful for real world problems in cp adj_list is to be used time complexity is same 
    // just it is easy to handle
    public static void representation_HashofHash(HashMap<String, ArrayList<String>> hm, int edges, Scanner sc){
        
        for(int i = 0 ; i < edges ; i++){
            String u = sc.next();   String v = sc.next();
            if(!hm.containsKey(u)){
                hm.put(u, new ArrayList<>());
                source_vertex = u;
            }
            if(!hm.containsKey(v))
                hm.put(v, new ArrayList<>());
            
            hm.get(u).add(v);
            hm.get(v).add(u);
        }
        
       for(Map.Entry pair : hm.entrySet()){
           System.out.print(pair.getKey()+" --->");
           ArrayList<String> temp = (ArrayList<String>) pair.getValue();
           for(String j : temp)
               System.out.print(" "+j);
           System.out.println("\n");
       }
    }
    
    public static void graph_weight(Scanner sc){
        int n = 3;
        ArrayList<Pair<Integer, Integer>> ar[] = new ArrayList[n];
        for(int i = 0 ; i < n ; i++)
            ar[i] = new ArrayList<>();
        
        int edges = 5;
        int u = 0, v = 0, w = 0;
        for(int i = 0 ; i < edges ; i++)
            ar[u].add(new Pair(v, w));
        
    }
    
    public static void DFS(HashMap<String, ArrayList<String>> hm, int edges, HashSet<String> visited, String ele){
        visited.add(ele);
        System.out.println(ele);
        for(String j : hm.get(ele))
            if(!visited.contains(j))
                DFS(hm, edges, visited, j);
    }
}
