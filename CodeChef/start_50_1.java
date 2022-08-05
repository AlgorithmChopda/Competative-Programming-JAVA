/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;

import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class start_50_1 {
    
    
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       
       int t = sc.nextInt();
       
       while(t-- > 0){
           int N = sc.nextInt();
           int Arr[] = new int[N];
           for(int i = 0;i<N;i++)
                Arr[i] = (i+1);
           Solution ob = new Solution();
           long ele = ob.gcd(N,Arr);
           
           int x = sc.nextInt();

           if(x >= N){
               
               long val = x-N+1;
               System.out.print(val+" ");
               long i = 1;
               while(i <= N){
                   if(i == x-N+1){
                       i++;
                       continue;
                   }
                   System.out.print(i+" ");
                   i++;
               }
               System.out.println();
                      
           }
           else {
               System.out.println("-1");
               continue;
           }
           
           
       }
       
           
    } 
}

class Solution
{
    public int gcd(int N , int arr[]) 
    { 
       //code here.
       if(N==1)
        return arr[0];
        
        int ans = gcd(arr[0],arr[1]);
        
        for(int i=2;i<arr.length;i++){
            ans = gcd(ans,arr[i]);
        }
        
        return ans;
    } 
    
    int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
}
