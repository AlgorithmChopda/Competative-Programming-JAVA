/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class START47 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            HashMap<Integer,Integer> hs = new HashMap<>();
            int cnt = 0;
            for(int i = 0 ; i < n ; i++){
                int temp = sc.nextInt();
                if(hs.containsKey(temp))
                    hs.put(temp, hs.get(temp)+1);
                else
                    hs.put(temp, 1);
            }
            
            for (Map.Entry itr : hs.entrySet()) {
                int value = (int)itr.getValue();
                if(value == 1)
                    cnt++;
            }
            
            System.out.println( ((cnt+1) / 2) );
            
        }
    }
}
