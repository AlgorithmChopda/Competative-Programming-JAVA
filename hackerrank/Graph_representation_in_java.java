
package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Graph_representation_in_java 
{
    int cnt = 0;
    HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
    
    public static void main(String args[])
    {
        Graph_representation_in_java g = new Graph_representation_in_java();
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("\n Enter the No of Edges  and No of Vertices: ");
        
        int edges = sc.nextInt();
        int vertices = sc.nextInt();
        
        for(int i = 0 ; i < vertices ; i++)
            ar.add(new ArrayList<>());

        int temp = 1;
        System.out.println("\n\n");
        
        while(temp <= edges){
            System.out.print("\n Source : ");
            int s = sc.nextInt();
            
            System.out.print("\n Destination : ");
            int d = sc.nextInt();
            
            g.add_in_Map(s,d);
            g.addEgde(ar, s, d);
            System.out.println("\n\n");
            temp++;
        }
        
        g.printGraph(ar);
    }
    
    public void addEgde(ArrayList<ArrayList<Integer>> ar , int s , int d)
    {
        System.out.println("\n src = "+hs.get(s)+"  Dest : "+hs.get(d));
        ar.get(hs.get(s)).add(hs.get(d));
    }
    
    public void printGraph(ArrayList<ArrayList<Integer>> ar)
    {
        for(int i = 0 ; i < ar.size() ; i++){
            System.out.println("\n Adjacency List of Vertex : "+i);
            for(int j = 0 ; j < ar.get(i).size() ; j++)
                System.out.println("\n "+hs.get(ar.get(i).get(j)));
        }
        
    }
    
    public void add_in_Map(int src , int desc){
        if(!hs.containsKey(src)){
            hs.put(src,cnt);
            cnt++;
        }
        
        if(!hs.containsKey(desc)){
            hs.put(desc, cnt);
            cnt++;
        }
    }
           
    
}
