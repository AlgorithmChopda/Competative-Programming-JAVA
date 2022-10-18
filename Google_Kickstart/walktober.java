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
public class walktober {
    static class Solution {
        public int solve(Scanner sc){
            
            int r = sc.nextInt();
            int c = sc.nextInt();
            int index = sc.nextInt();
            
            int max[] = new int[c];
            int ar[] = new int[c];
            
            for(int i = 0 ; i < r ; i++){
                for(int j = 0 ; j < c ; j++){
                    int ele = sc.nextInt();
                    max[j] = Math.max(max[j], ele);
                    if(i+1 == index)
                        ar[j] = ele;
                }
            }
            
            /*System.out.println("\n ");
            for(int i = 0 ; i < c ; i++)
                System.out.print(ar[i]+" ");
            
            System.out.println("\n ");
            for(int i = 0 ;i < c ; i++)
                System.out.print(max[i]+" ");
            */           
            
            int sum = 0;
            for(int i = 0 ; i < c ; i++)
                if(max[i] > ar[i])
                    sum += (max[i] - ar[i]);
            
            return sum;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(n-- > 0){
            System.out.println("Case #"+i+": "+new Solution().solve(sc));
        }
    }
}
