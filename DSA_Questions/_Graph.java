/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.ArrayList;

/**
 *
 * @author Vinay Chopda
 */

class Graph{
    public int edges;
    public ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
    public Graph(){
        
    }
    public void addEdge(int s, int d, boolean bidir){
        ar.get(s).add(d);
        if(bidir)
            ar.get(d).add(s);
    }
    
    public void print(){
        for(int i = 0 ; i < ar.size() ; i++){
            System.out.print(i+" --> ");
            for(Integer ele : ar.get(i))
                System.out.print(ele);
        }
    }
    
}

public class _Graph {
    public static void main(String args[]){
        Graph g = new Graph();
        g.addEdge(0, 1, false);
        g.addEdge(0, 2, false);
        g.addEdge(1, 0, false);
        g.print();
    
    }
}
