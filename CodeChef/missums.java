/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Vinay Chopda
 */
public class missums {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            
            while(t > 0)
            {
                int n = sc.nextInt();
                if(n == 1){
                    System.out.println("1");
                    t--;
                    continue;
                }
                
                int[] op = new int[n];
                int length = 0;
                HashSet<Integer> hs = new HashSet<Integer>();
                int cur = 1;
                
                while(length < n)
                {
                    if(hs.contains(cur+cur)){
                        cur++;
                        continue;
                    }
                    
                    int i = 0;
                    for(i = 0; i < length ; i++)
                    {
                        if(hs.contains(op[i]+cur)){
                            break;
                        }
                            
                    }
                    
                    if(i == length){
                        op[length] = cur;
                        hs.add(cur+cur);
                        for(int j = 0 ; j < length; j++){
                            hs.add(j+cur);
                        }
                        length++;
                    }
                    cur++;
                    
                }
                
                for(int i = 0 ; i < length ; i++){
                    System.out.print(op[i]+" ");
                }
                System.out.println();
                t--;
            }
            
    }
}
