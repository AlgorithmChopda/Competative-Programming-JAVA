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
public class start42 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int cnt = 0;
            String s = sc.next();
            for(int i = 0 ; i <= n-2 ; i++){
                if(i == 0 && s.charAt(i) == '1'){
                    cnt++;
                    continue;
                }
                
                if( i == n-2 ){
                    if(s.charAt(i) == '0')
                        cnt++;
                }
                else{
                        if(s.charAt(i+1) == '1' && s.charAt(i) == '0')
                            cnt++;
                }
            }
            System.out.println(cnt);
        }    
    }
}
