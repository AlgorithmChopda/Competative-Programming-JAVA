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
public class CountingInversion {
    
    void acSolution() {
        
    }
    public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); 
		while(t-- > 0) {
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    int ar[] = new int[n];
		    for(int i = 0 ; i < n ; i++) {
		        ar[i] = sc.nextInt();
		    }
		    
		    long ans = 0;
		    for(int i = 0 ; i < n ; i++) {
		        long prevele = 0, nextele = 0;
		         for(int j = 0 ; j < n ; j++) {
		             if( i == j ) continue;
		             if(ar[i] > ar[j]) {
		                 if(j < i) {
		                    prevele++;       
		                 }
		                 else{
		                     nextele++;
		                 }
		             }
		         }
		         
		         ans += ( (long)(k * (long)(k + 1) / 2l) * (long)nextele);
                         //System.out.println(ar[i]+" "+ans);
		         long val = k - 1;
		         ans += ( (long)(val * (long)(val + 1) / 2l) * (long)prevele);
                         //System.out.println(ar[i]+" "+ans);
                         //System.out.println();
		    }
		    
		    System.out.println(ans);
		}
        
//        Scanner sc = new Scanner(System.in);
//	    int t = sc.nextInt();
//	    while(t-->0){
//	        int n = sc.nextInt();
//	        long k = sc.nextLong();
//	        int i,j;
//	        int[] a = new int[n];
//	        long ans = 0;
//	        
//	        for(i=0;i<n;i++){
//	                a[i] = sc.nextInt();
//	        }
//	        long count = 0;
//	        for(i=0;i<n;i++){
//	            for(j=0;j<n;j++){
//	                if(a[i]>a[j]){
//	                    count++;
//	                }
//	            }
//	        }
//	        ans = count*(k*(k-1)/2);
//	        count = 0;
//	        for(i=0;i<n;i++){
//	            for(j=i+1;j<n;j++){
//	                if(a[i]>a[j]){
//	                    count++;
//	                }
//	            }
//	        }
//	        ans = count*k+ans;
//	        
//	        System.out.println(ans);
//	    }
	}
}
