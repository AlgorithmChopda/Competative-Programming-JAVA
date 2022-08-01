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
public class start49_splstr {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){   
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();
            
            int cnt_1 = 0, cnt_0 = 0;
            for(int i = 0 ; i < n ; i++){
                if(str.charAt(i) == '1')
                    cnt_1++;
                else
                    cnt_0++;
            }
            
            int diff = Math.abs(cnt_1 - cnt_0);
            if(diff == 0){
                System.out.println("0");
                continue;
            }
            if(diff <= k)
                System.out.println("1");
            else{
                if(diff % k == 0){
                    System.out.println(diff/k);
                }
                else
                    System.out.println(k/diff+1);
            }
        }
    }
}
