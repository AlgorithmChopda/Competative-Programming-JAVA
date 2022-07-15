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
public class revsort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            
            int ar[] = new int[n];
            int max = -1, max_index = -1;
            for(int i = 0 ; i < n ; i++){
                ar[i] = sc.nextInt();
                if(max < ar[i]){
                    max = ar[i];
                    max_index = i;
                }
            }
            
            if(max >= x && max_index != n-1)
                System.out.println("NO"); 
            else{
                boolean flag = true;
                for(int i = 0 ; i < n ; i++){
                    for(int j = 0 ; j < n ; j++){
                        if(ar[i] + ar[j] > x){
                            flag = false;
                            break;
                        }
                    }
                    if(!flag)
                        break;
                }
                
                if(flag)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
