/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.PriorityQueue;

/**
 *
 * @author Vinay Jain
 */
public class Weekly_372 {
    public int findMinimumOperations(String s1, String s2, String s3) {
        char a[] = s1.toCharArray(), b[] = s2.toCharArray(), c[] = s3.toCharArray();
        int n1 = s1.length(), n2 = s2.length(), n3 = s3.length();
        
        int min = Math.min(n1, Math.min(n2, n3));
        int i = 0;
        while(i < min) {
            if(a[i] != b[i] || a[i] != c[i]) {
                if(i == 0)  return -1;
            }
            i++;
        }
        
        int val = i * 3;
        int sum = n1 + n2 + n3;
        return sum - val;
    }
    
    void temp() {
        
    }
    
    
    public static int maxEarning(int N, int M, int[] quantityAvailable, int[] quantityNeeded, int[] costOfOneUnit, int[] sellingPrice) {
        int maxAmount = 0;

        // comp, index
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int i = 0; i < M; i++) {
            if (quantityAvailable[i] >= quantityNeeded[i]) {
                int cost = quantityNeeded[i] * costOfOneUnit[i];
                pq.add(new int[] {sellingPrice[i] - cost, i} );
            }
        }
        
        int val = N;
        int ans = 0;
        
        while(pq.isEmpty() == false) {
            
            if(val <= 0)    return ans;
            
            int temp[] = pq.remove();
            int i = temp[1];
            int cost = quantityNeeded[i] * costOfOneUnit[i];
            
            System.out.println("Index : " + i + " Profit Getting : " + temp[0]);
            
            if(cost > val)  continue;
            
            int item = val / cost;
            int profit = (item * temp[0]);
            
            val -= (item * quantityNeeded[i]);
            
            ans += profit;
            
            System.out.println("Profit : " + profit);
        }

        return ans;
    }

    public static void main(String[] args) {
 

        // Input
        int N = 21;
        int M = 3;

        int[] quantityAvailable = new int[] {11, 12, 13};
        int[] quantityNeeded = new int[] {3, 4, 5};
        int[] costOfOneUnit = new int[] {2, 1, 2} ;
        int[] sellingPrice = new int[] {20, 15, 12};

//        for (int i = 0; i < M; i++) {
//            quantityAvailable[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < M; i++) {
//            quantityNeeded[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < M; i++) {
//            costOfOneUnit[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < M; i++) {
//            sellingPrice[i] = scanner.nextInt();
//        }

        // Output
        int result = maxEarning(N, M, quantityAvailable, quantityNeeded, costOfOneUnit, sellingPrice);
        System.out.println(result);
    }
}
