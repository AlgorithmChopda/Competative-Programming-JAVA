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
public class _6323 {
    public static int distMoney(int m, int c) {
        if(m < c)
            return -1;
        int ar[] = new int[c];
        
        int i = 0;
        m -= c;
        for(i = 0 ; i < c-1 ; i++){
            if(m - 7 >= 0){
                ar[i] += 7;
                m -= 7;
            }
            else{
                break;
            }
        }
        
        System.out.println("\n m = "+m);
        if(m == 3){
            ar[c-1] = m+1;
            ar[c-2]--;
        }
        else{
            ar[c-1] = m;
        }
        
        int cnt = 0;
        for(i = 0 ; i < c ; i++){
            if(ar[i] == 7)
                cnt++;
        }
        
        
        return cnt;
    }
    
    public static void main(String args[]){
        System.out.println(distMoney(20, 3));
    }
}
