/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class START49_HIGHFREQUENCY {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            
            int n = sc.nextInt();
            HashMap<Integer, Integer> hm = new HashMap<>();
            
            for(int i = 0 ; i < n ; i++){
                int temp = sc.nextInt();
                if(hm.containsKey(temp))
                    hm.put(temp, hm.get(temp)+1);
                else
                    hm.put(temp, 1);
            }
            
            int max_1 = 1, max_2 = 1;
            for(Entry val : hm.entrySet()){
                if((int)val.getValue() > max_1){
                    max_2 = max_1;
                    max_1 = (int)val.getValue();
                    continue;
                }
                if((int) val.getValue() > max_2)
                    max_2 = (int) val.getValue();
            }
                        
            if(max_1 % 2 == 0)
                System.out.println(Math.max(max_1/2, max_2));
            else
                System.out.println(Math.max(max_1/2 + 1, max_2));

        }
        
    }
}
