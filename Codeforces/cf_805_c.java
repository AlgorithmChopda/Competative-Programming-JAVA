/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeforces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class cf_805_c {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int q = sc.nextInt();
            
            HashMap<Integer, ArrayList<Integer>> hs = new HashMap<>();
            for(int i = 0 ; i < n ; i++){
                int temp = sc.nextInt();
                if(hs.containsKey(temp))
                    hs.get(temp).add(i);
                else{
                    ArrayList<Integer> ar = new ArrayList<>();
                    ar.add(i);
                    hs.put(temp, ar);
                }
            }
            
            for(int i = 0 ; i < q ; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                if( hs.get(a) != null && hs.get(b) != null ){
                    int j = 0, k = 0;
                    if(hs.get(a).get(0) < hs.get(b).get(hs.get(b).size()-1) )
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
                else
                    System.out.println("NO");
            }
            
        }
    }
}
