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
public class CodeChef_Starter21 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int ar[][] = new int[n][n];
            
            int row, col,start;
            row = sc.nextInt();
            col = sc.nextInt();
            
            for(int i = 0 ; i < n ; i++)
            {
                if(i%2 == 0)
                    start = 0;
                else
                    start = 1;
                
                for(int j = start ; j < n; j+=2)
                    ar[i][j] = 1;
                
            }
            
            if(ar[row][col] == 1)
                System.out.println("0");
            else
                System.out.println("1");
            
            /*for(int i = 0 ; i < n ; i++ )
            {
                for(int j = 0 ; j < n ; j++)
                {
                    System.out.print(ar[i][j]+" ");
                }
                System.out.println("\n ");
            }*/
            
        }
    }
}
