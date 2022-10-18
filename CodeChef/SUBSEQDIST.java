/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class SUBSEQDIST {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            HashMap<Integer, Integer> hs = new HashMap<>();
            int max = -1;
            for(int i = 0 ; i < n ; i++){
                int val = sc.nextInt();
                if(hs.containsKey(val)){
                    int f = hs.get(val);
                    max = Math.max(max, f+1);
                    hs.put(val, f+1);
                }
                else{
                    hs.put(val, 1);
                    max = Math.max(max, 1);
                }
            }

            System.out.println(max-1);
        }
    }
}
