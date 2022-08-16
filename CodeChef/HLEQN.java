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
public class HLEQN {
    
    
    static class Solution {
        public void solve(Scanner sc){
            int n = sc.nextInt();
            for(int k = n ; k <= n+100 ; k++){
                System.out.println("\n K : "+k);
                for(int i = 1 ; i < k/2 ; i++){
                    for(int j = 1 ; j < k/2 ; j++){
                        if( 2*i + 2*j + i*j == k){
                            //if(i == 1 || j == 1)
                            //    break;
                            System.out.println("i : "+i+" j : "+j);
                        }
                    }
                }
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)  new Solution().solve(sc);
    }
}
