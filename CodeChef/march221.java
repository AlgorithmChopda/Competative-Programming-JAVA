/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vinay Chopda
 */

class Node{
    int val, no;
    public Node(int no, int val) {
        this.val = val;
        this.no = no;
    }
}

public class march221 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            Node ar[] = new Node[n+1];
            Node zero = null;
            for(int i = 1 ; i <= n ; i++){
                int val = sc.nextInt();
                ar[i] = new Node(i, val);
                
                if(val == 0)
                    zero = ar[i];
            }
           
            ArrayList<Node> li[] = new ArrayList[n+1]; 
            for(int i = 1 ; i <= n ; i++)
                li[i] = new ArrayList<Node>();
            
            for(int i = 1 ; i < n ; i++){
                int u = sc.nextInt();
                int v = sc.nextInt();
                
                li[u].add(ar[v]);
            }
            
            System.out.println("\n List : ");
            for(int i = 1 ; i < li.length ; i++){
                System.out.print("\nNode "+i+" --->  ");
                for(Node temp : li[i])
                    System.out.print(" "+temp.no+"-"+temp.val);
            }
            
            
            if(zero == null){
                System.out.println("0");
                continue;
            }
            
            boolean visited[] = new boolean[n+1];
            
            ArrayList<Integer> nodes = new ArrayList<>();
            DFS(zero, visited, nodes, li);
            
            
            /*for(int i = 1 ; i <= n ; i++){
                if(ar[i] != zero){
                    System.out.println("looking int list of Node : "+ar[i].val);
                    for(Node temp : li[i])
                        if(temp.val == 0)
                            nodes.add(ar[i].val);
                }
            }*/
        
            Path_To_Zero(li, nodes, 1, ar);
            if(ar[1].val != 0)
                nodes.add(ar[1].val);
            
            System.out.println("\n op : ");
            for(int val : nodes){
                System.out.println(val);
            }
            
            /*for(int i = 1 ; i < li.length ; i++){
                System.out.print("\nNode "+i+" --->  ");
                for(Node temp : li[i])
                    System.out.print("  "+temp.no+"-"+temp.val);
            }*/
            
            
            
            
        }
    }

    public static void DFS(Node zero, boolean[] visited, ArrayList<Integer> nodes, ArrayList<Node> li[]) {
        visited[zero.no] = true;
        nodes.add(zero.val);
        for(Node val : li[zero.no])
            if(!visited[val.no])
                DFS(val, visited, nodes, li);
    }
    
    public static boolean Path_To_Zero(ArrayList<Node> li[], ArrayList<Integer> op, int no, Node ar[]){
        if(ar[no].val == 0)
            return true;
        for(Node n : li[no]){
            if(Path_To_Zero(li, op, n.no, ar))
                op.add(ar[no].val);
            
        }        
        return false;
    }
    
}
