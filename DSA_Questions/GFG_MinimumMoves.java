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
public class GFG_MinimumMoves {
    
     static boolean is2 (int x)
    {
      /* First x in the below expression is
        for the case when x is 0 */
        return x!=0 && ((x&(x-1)) == 0);
         
    }
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while(t-- > 0){
	    int a = sc.nextInt();
	    int b = sc.nextInt();
       
            if(a >= b)
	        System.out.println((a-b));
            else{
                int val = 0;
                int n1 = a;
                
                int diff = (a - b);
                boolean flag = is2(diff);
                if(flag){
                    System.out.println();
                }
                
                ArrayList<Integer> ar = new ArrayList<>();
                for (int i = 0; i <= 18; i++) {
                    int k = n1 >> i;
                    if ((k & 1) > 0)
                        ar.add(1);
                    else
                        ar.add(0);
                }
                
                int sum = 0;
                for(int i = 0 ; i <= 18 ; i++){
                    //if()
                }
                
            }
        }
    }
    
    
    public static int maxSum(int ar[], int k) {
        int n = ar.length, cnt = 0;
        for(int i = 0 ; i < n ; i++)
            if(ar[i] == 0)
                cnt++;
        if( cnt <= k)
            return n;
        
        int left[] = new int[n];
        int right[] = new int[n];
        
        left[0] = ar[0];
        for(int i = 1 ; i < n ; i++){
            if(ar[i] == 0)
                left[i] = 0;
            else
                left[i] += left[i-1];
        }
        
        right[n-1] = ar[n-1];
        for(int i = n-2 ; i >= 0 ; i--){
            if(ar[i] == 0)
                right[i] = 0;
            else
                right[i] += left[i+1];
        }
            
        return cnt;
        
    }
    
    
}
