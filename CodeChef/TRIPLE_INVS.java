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
public class TRIPLE_INVS {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int ar[] = new int[n];
            
            for(int i = 0 ; i < n ; i++)
                ar[i] = sc.nextInt();
            
            int i;
            for(i = 0 ; i < n-1 ; i++){
                if(ar[i] == 0){
                    if(ar[i+1] == 2 || ar[i+1] == 3)
                        break;
                }
                
                if(ar[i] == 1){
                    if(ar[i+1] == 0)
                        break;
                }
                
                if(ar[i] == 2){
                    if(ar[i+1] == 0)
                        break;
                }
                
                if(ar[i] == 3){
                    if(ar[i+1] == 0)
                        break;
                }    
            }
            
            if(i == n-1)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
