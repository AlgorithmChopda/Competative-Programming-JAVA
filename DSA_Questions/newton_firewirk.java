/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class newton_firewirk {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //int t = sc.nextInt();
        
            HashMap<Long, Integer> hs = new HashMap<>();
            for(long j = 1 ; j <= 1000 ; j++){
                long n = j;
                long end = (long) Math.sqrt(n);
                ArrayList<Long> a = new ArrayList<>();

                for (int i=1; i <= end; i++)
                {
                    if (n%i==0)
                    { 
                        a.add((long)i);
                        if (n/i != i)
                            a.add(n/i);
                    }
                }
                
                System.out.println(n);
                int ans = 0;
                for(long i : a){
                    long val = i;
                    long sum = 0;
                    while (i != 0){
                        sum = sum + i % 10;
                        i = i/10;
                    }
                    //System.out.println(i+" : "+sum);
                    if( (sum * val) == n){
                        System.out.println("\t"+val+" : "+sum);
                        ans++;
                    }
                }
                hs.put(j, ans);
            }
            
            
        }
}
