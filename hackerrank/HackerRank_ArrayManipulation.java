
package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class HackerRank_ArrayManipulation {
    public static void main(String args[]){
        
        List<List<Integer>> ar= new ArrayList<>();
        
        ar.add(new ArrayList<>());
        ar.add(new ArrayList<>());
        ar.add(new ArrayList<>());
        ar.add(new ArrayList<>());

        
        
        ar.get(0).add(2);
        ar.get(0).add(6);
        ar.get(0).add(8);
        
        ar.get(1).add(3);
        ar.get(1).add(5);
        ar.get(1).add(7);
        
        ar.get(2).add(1);
        ar.get(2).add(8);
        ar.get(2).add(1);
        
        ar.get(3).add(5);
        ar.get(3).add(9);
        ar.get(3).add(5);
        
        
        System.out.println("\n "+arrayManipulation(10,ar));
    }
    
    
    public static long arrayManipulation(int n, List<List<Integer>> queries) 
    {
        
        int mat[] = new int[n];
        
        for(int i = 0 ; i < n ; i++){
            mat[i] = 0;
        }
        
        for(int i = 0 ; i < queries.size() ; i++){
            int k = queries.get(i).get(2);
            for(int j = queries.get(i).get(0)-1 ; j <= queries.get(i).get(1)-1 ; j++){
               int sum = mat[j] + k;
               mat[j] = sum; 
            }
        }
        
        int max = mat[0];
        
        for(int i = 0 ; i < n ; i++)
            max = Math.max(max,mat[i]);
        
        return max;
        
    }
    
}
