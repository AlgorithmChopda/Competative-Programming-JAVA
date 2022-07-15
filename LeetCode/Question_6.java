/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Scanner;

/**
 *
 * @author Vinay Chopda
 */
public class Question_6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int t = sc.nextInt();
        Solve(str, t);
    }

    private static void Solve(String str, int t) {
        if(t == 1)
        {
            System.out.println(str);
            return;
        }
        char mat[][] = new char[t][1005];
        int cnt = 0, j = 0, i = 0, end, col = 0;
        
        //          PAYPALISHIRING
        while(cnt < str.length())
        {
            for( ; cnt < str.length() && i < t ; i++){
                System.out.println("char : "+str.charAt(cnt) + " i : "+i+ " j : "+j);
                mat[i][j] = str.charAt(cnt);    cnt++;
            }
            
            col = j;
            i -= 2; j++;
            end = j + t - 1;
            for(; cnt < str.length() && j < end ; j++, i--){
                System.out.println("char : "+str.charAt(cnt) + " i : "+i+ " j : "+j);
                mat[i][j] = str.charAt(cnt); cnt++;
            }
            col = j;
            i += 2; j--;
        }
        
        
        System.out.println("\n");
        String op = "";
        for(i = 0 ; i < t ; i++){
            for(int k = 0 ; k < col ; k++){
                if(mat[i][k] == '\u0000')
                    op += '\u0000';
                else
                    op += mat[i][k];
                System.out.print(mat[i][k] + " ");
            }
            System.out.print("\n");
        }
        
        System.out.println("\n\n\n op : "+op);
    }
}
