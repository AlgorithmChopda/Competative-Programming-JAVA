/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashSet;

/**
 *
 * @author Vinay Jain
 */
public class _6355_leetccode {
    boolean isPrime(int n){
        for(int i = 2 ; i < Math.sqrt(n) ; i++) {
            if(n % i == 0)
                return false;
        }
        
        return true;
    }
    boolean isIncreasing(int ar[], int start) {
        for(int i = start+1 ; i < ar.length ; i++){
            if(ar[i] <= ar[i-1])
                return false;
        }
        
        return true;
    }
    public boolean primeSubOperation(int[] ar) {
        int val = 1;
        if(isIncreasing(ar, 0))
            return true;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < ar.length ; i++){
            boolean flag = true;
            while(true){
                if(val >= ar[i] || val > 2000)
                    return false;
                if(set.contains(ar[i] - val) == false && isPrime(ar[i] - val)){
                    set.add(ar[i] - val);
                    val++;
                    break;
                }
                val++;
            }
            if(isIncreasing(ar, i+1))
                return true;
        }
        
        return true;
    }
}
