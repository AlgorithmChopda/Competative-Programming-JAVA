/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;

import java.util.Scanner;

/**
 *
 * @author Vinay Chopda
 */
public class GMINEQ {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int ar[] = new int[n];
            int val = 0, val_ = 0;
            for(int i = 0 ; i < n ; i++){
                ar[i] = sc.nextInt();
                if(ar[i] == 1)
                    val++;
                else
                   val_++;
            }
            
            if(val == val_) // count of 1 and -1 is same
                System.out.println("YES\n");
            else
            {
                if(val + 1 == val_ || val_ + 1 == val)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            
        }
    }
}
