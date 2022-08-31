/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google_Kickstart;

import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class Coloring_Game {
    
    public static int solve(int n){
        n--;
        return (n / 5 + 1);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1 ; i <= t ; i++){
            int n = sc.nextInt();
            System.out.println("Case #"+i+": "+solve(n));
        }
    }        
}
