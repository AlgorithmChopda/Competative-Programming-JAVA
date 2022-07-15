/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Vinay Chopda
 */
public class leetcode_6071 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        
        for(int i = 0 ; i < n ; i++)
            ar[i] = sc.nextInt();
        
        HashMap<Integer, Integer> hs = new HashMap<>();
        
        for(int i = 0 ; i < n ; i++){
            if(hs.containsKey(ar[i]))
                hs.put(ar[i], hs.get(ar[i]) + 1);
            else
                hs.put(ar[i], 1);
        }
        
        int cnt = 0;
        for (Map.Entry mapElement : hs.entrySet()) {
            int key = (int)mapElement.getKey();
            int value = (int)mapElement.getValue();

            System.out.println("key : "+key+" value : "+value);
            if(value == 1){
                cnt = -1;
                break;
            }
            
            if(value == 2 || value == 3){
                cnt++;
                continue;
            }
            
            if(value == 4){
                cnt += 2;
                continue;
            }
            
            
            if(value % 3 ==1){
                cnt += 2    ;
                value -= 4;
            }
            
            if(value % 3 == 2){
                cnt++;
                value -= 2;
            }
            
            cnt += (value/3);   
            
            //System.out.println("key : "+key+" value : "+value+"round : "+cnt);
        }
        
        System.out.println("cnt : "+cnt);
    }
}
