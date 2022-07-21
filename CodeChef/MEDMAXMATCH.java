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
public class MEDMAXMATCH {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int ar[] = new int[n];
            int br[] = new int[n];
            
            for(int i = 0 ; i < n ; i++)
                ar[i] = sc.nextInt();
            
            for(int i = 0 ; i < n ; i++)
                br[i] = sc.nextInt();
            
            if(n == 1){
                System.out.println(ar[0]+br[0]);
                continue;
            }
            
            Arrays.sort(ar);
            Arrays.sort(br);
            
            int temp = n/2;
            //System.out.println(Math.max(ar[temp]+br[temp], Math.min(ar[temp]+br[temp+1], ar[temp+1]+ br[temp]) ));
            
            System.out.println(Math.max(ar[temp]+br[temp], ar[temp+1]+br[temp+1]) );
             
        }
        
    }
}
