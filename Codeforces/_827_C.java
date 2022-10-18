/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeforces;

import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class _827_C {
    static class Solution {
        public void solve(Scanner sc){
            
            int mat[][] = new int[8][8];
            for(int i = 0 ; i < 8 ; i++){
                String s = sc.next();
                for(int j = 0 ; j < 8 ; j++){
                    switch(s.charAt(j)){
                        case 'R': mat[i][j] = 2;break;
                        case 'B': mat[i][j] = 1;break;
                        case '.': mat[i][j] = -1;break;
                    }
                }
            }
            
            /*for(int i = 0 ;  i < 8 ; i++){
                for(int j = 0 ; j < 8 ; j++)
                    System.out.print(mat[i][j]+" ");
                System.out.println("");            
            }*/
            
            for(int i = 0 ; i < 8 ; i++){
                boolean flag = true;
                for(int j = 0 ; j < 8 ; j++){
                    if(mat[i][j] == 1 || mat[i][j] == -1){
                       flag = false;
                       break;
                    }
                }
                
                if(flag){
                    System.out.println("R");
                    return;
                }
            }
            
            System.out.println("B");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
