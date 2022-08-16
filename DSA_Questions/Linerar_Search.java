/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class Linerar_Search {
    
    public static int Linear_search(int ar[], int n, int k){
        for(int i = 0 ;i < n ; i++){
            if(ar[i] == k)
                return i;
        }
        return -1;  // denotes key no t found....
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // no of elements in the array
        int n;
        n = sc.nextInt();
        
        int ar[] = new int[n];
        
        // getting the array from the user
        for(int i = 0 ; i < n ; i++)
            ar[i] = sc.nextInt();
            
        System.out.println(Linear_search(ar, n, 10));
    }
}
