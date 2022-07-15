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
public class TCS_D {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum[] = new int[n+1];
        for(int i = 1 ; i <= n ; i++)
            sum[i] = sc.nextInt();
      
        ArrayList<Integer> ar[] = new ArrayList[n+1];
        for(int i = 1 ; i <= n ; i++)
            ar[i] = (new ArrayList<>());
        
        int edges = sc.nextInt();
        for(int i = 1 ; i <= edges ; i++){
            int u = sc.nextInt();   int v = sc.nextInt();
            ar[u].add(v);
            ar[v].add(u);
        }
        
        boolean visited[] = new boolean[n+1];
        ArrayList<ArrayList<Integer>> op = new ArrayList<>();
        
        for(int i = 1 ; i <= n ; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            if(!visited[i]){
                DFS(i, ar, temp, visited);
                op.add(temp);
            }    
        }
        
        //for(int i = 0 ; i < op.size() ; i++)
        //    System.out.println(op.get(i));
        
        
        int ans = 0;
        for(ArrayList<Integer> i : op){
            int val = 0;
            for(Integer ele : i)
                val += sum[ele];
            //System.out.println("value : "+val);
            ans = Math.max(ans, val);
        }
        
        System.out.println(ans);
    }

    public static void DFS(int i, ArrayList<Integer>[] ar, ArrayList<Integer> temp, boolean visited[]) {
        visited[i] = true;
        temp.add(i);
        for(Integer ele : ar[i])
            if(!visited[ele])
                DFS(ele, ar, temp, visited);
    }
    
}
