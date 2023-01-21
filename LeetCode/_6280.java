/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author Vinay Jain
 */
public class _6280 {
    
    boolean check_prime(int n){
        if (n == 1) return false;
        if (n == 2) return true;
        
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    public int[] closestPrimes(int left, int right) {
        int op[] = {-1, -1};
        int k = 0;
       
        int first = -1, second = -1;
        int min = Integer.MAX_VALUE;
        for(int i = left ; i <= right ; i++){
            if(check_prime(i)){
                if(first == -1){
                    first = i;
                }
                else{
                    if(second == -1){
                        second = i;
                        
                        op[0] = first;
                        op[1] = second;
                        min = (second - first);
                    }
                    else{
                        first = second;
                        second = i;
                        if(min  > (second - first)){
                            op[0] = first;
                            op[1] = second;
                            min = (second - first);
                        }
                    }
                }
            }
        }
        
        return op;
    }
}
