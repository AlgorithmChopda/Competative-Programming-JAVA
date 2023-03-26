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
public class _6309 {
    int gcd(int a, int b){
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    public int findValidSplit(int[] ar) {
        for(int i = 0 ; i < ar.length - 1 ; i++){
            boolean flag = true;
            for(int k = 0; k <= i ; k++){
                for(int j = i+1 ; j < ar.length ; j++){
                    int gcd = (ar[j] % ar[k]);
                    if(gcd != 1){
                        flag = false;
                        break;
                    }
                }
                if(!flag)
                    break;
            }
            
            if(flag)
                return i;
        }
        
        return -1;
    }
}
