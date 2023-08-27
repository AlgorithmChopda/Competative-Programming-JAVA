/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;
import java.util.HashMap;
import java.util.HashSet;
/**
 *
 * @author Vinay Jain
 */
public class _weekly_348 {
    public int minimizedStringLength(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++) {
            char c = s.charAt(i);
            if(map.containsKey(c) == false) map.put(c, 1);
        }
        
        return map.size();
    }
    
    
    
    public int semiOrderedPermutation(int[] ar) {
        int min = 0, max = 0;
        for(int i = 1 ; i < ar.length ; i++) {
            if(ar[min] > ar[i]) {
                min = i;
            }
            
            if(ar[max] < ar[i]) {
                max = i;
            }
        }
        
        int cnt = min + (ar.length - (max + 1) );
        if(max < min) cnt--;
        
        return cnt;
    }
    
    
    public long matrixSumQueries(int n, int[][] q) {
//        int row[][] = new int [n][2];
//        int col[][] = new int [n][2];
//        
//        for(int i = 0 ; i < q.length ; i++) {
//            if(q[i][0] == 0) {
//                // row
//                int r = q[i][1];
//                int val = q[i][2];
//                row[r][0] = val;
//                row[r][1] = (i+1);
//            }
//            else {
//                col[q[i][1]][0] = q[i][2];
//                col[q[i][1]][1] = (i+1);
//            }
//        }
//        
//        int sum = 0 ;
////        for(int i = 0 ; i < n ; i++) {
////            for(int j = 0 ; j < n ; j++) {
////                if(row[i][1] > col[i][1]) 
////                    sum += row[i][0];
////                else
////                    sum += col[i][0];
////                System.out.print(sum+" ");
////            }
////            System.out.println();
////        }
//        
//        int i = 0, j = 0;
//        
//        while(i < n && j < n) {
//            if(row[i][1] > col[j][1]) {
//                // row was updated..
//                int temp = (n - (j + 1)) * row[i][0];                
//                i++;
//                sum += temp;
//            }
//            else {
//                int temp = (n - (i + 1)) * col[j][0];
//                j++;
//                sum += temp;
//            }
//            
//        }
//        
//        return sum;
//    }
        
      int r = 0, c = 0;
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
      long sum = 0;
      for(int i = q.length - 1 ; i >= 0 ; i--) {
          if(r == n || c == n)  break;
          if(q[i][0] == 0) {
              if(row.contains(q[i][1])) continue;
              sum += (long)((n - c) * q[i][2]);
              r++;
              row.add(q[i][1]);
          }
          else {
              if(col.contains(q[i][1])) continue;
              sum += (long) ((n - r) * q[i][2]);
              c++;
              col.add(q[i][1]);
          }
      }
    
     return sum;
    }
}
