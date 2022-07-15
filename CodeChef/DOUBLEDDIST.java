/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class DOUBLEDDIST {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            Integer ar[] = new Integer[n];
            
            for(int i = 0 ; i < n ; i++)
                ar[i] = sc.nextInt();
            
            Arrays.sort(ar, Collections.reverseOrder());
            
            int i;
            for(i = 1 ; i < n ; i++){
                int diff = (ar[i] - ar[i-1]);
                int diff2 = (ar[i+1] - ar[i]);
                
                if(2*diff != diff2)
                    break;
            }
            
            if(i == n)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
