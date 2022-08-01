/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class start49_monks {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int ar[] = new int[n];
            
            for(int i = 0 ; i < n ; i++)
                ar[i] = sc.nextInt();
             
            Arrays.sort(ar);
            long diff = 0;
            
            for(int i = 0 ; i < n-1 ; i++)
                diff += (ar[n-1] - ar[i]);
            
            int last_index = n-1;
            int cnt = 0;
            
            if(diff > ar[last_index]){
                       
                System.out.println("\n\n diff : "+diff);
                System.out.println("\n cnt : "+cnt);
                
                while(diff >= ar[last_index]){
                    if(last_index == 1){
                        System.out.println(cnt+1);
                        continue;
                    }
                    diff -= ar[last_index];
                    diff -= (ar[last_index] - ar[last_index-1]) * last_index;
                    
                    
                    last_index--;
                    cnt++;
                    
                    System.out.println("\n\n diff : "+diff);
                    System.out.println("\n cnt : "+cnt);
                }
                
                System.out.println("\n\n diff : "+diff);
                    System.out.println("\n cnt : "+cnt);
                
                if(diff != 0)
                    System.out.println(cnt+1);
                else
                    System.out.println(cnt);
            }
            else{
                if(diff == 0)
                    System.out.println("0");
                else
                    System.out.println("1");
            }
        }
        
    }
}
