/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author Vinay Chopda
 */
public class hello {
    public static void main(String args[]){
        int ar[] = {1,1,0,0,0,1,0,1,0,1,0};
        maxSum(ar, 0);
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
                left[i] = left[i-1] + 1;
        }
        
        right[n-1] = ar[n-1];
        for(int i = n-2 ; i >= 0 ; i--){
            if(ar[i] == 0)
                right[i] = 0;
            else
                right[i] = right[i+1] + 1;
        }
            
        /*System.out.println("\n left : ");
        
        for(int i = 0 ; i < n ; i++)
            System.out.print(left[i]+" ");
        
        System.out.println("\n rioght  : ");
        for(int i = 0 ; i < n ; i++)
            System.out.print(right[i]+" ");
        */
        
        
        int fi[] = new int[n];
        //fi[0] = right[1]+1;
        //fi[n-1] = left[n-2]+1;
        for(int i = 1 ; i < n-1 ; i++){
            if(ar[i] == 1)
                fi[i] = -1;
            else
                fi[i] = left[i-1]+right[i+1] + 1;
        }
        
        
        for(int i = 0 ; i < n ; i++)
            System.out.print(fi[i]+" ");
        
        
        return cnt;
        
    }
    
    
}
