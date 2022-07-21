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
public class MAKEPALAGAIN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            String str = sc.next();
            
            HashMap<Character, Integer> map_a = new HashMap<>();
            HashMap<Character, Integer> map_b = new HashMap<>();
            
            for(int i = 0 ; i < n ; i++){
                if(i % 2 == 0){
                    if(map_a.containsKey(str.charAt(i)))
                        map_a.put(str.charAt(i), map_a.get(str.charAt(i)) + 1);
                    else
                        map_a.put(str.charAt(i), 0);
                }
                else{
                    if(map_b.containsKey(str.charAt(i)))
                        map_b.put(str.charAt(i), map_b.get(str.charAt(i)) + 1);
                    else
                        map_b.put(str.charAt(i), 0);
                }
            }
            
            boolean op = true;
            
            for (Map.Entry mapElement : map_a.entrySet()) {
                char key = (char) mapElement.getKey();
                int value = (int)mapElement.getValue();
                
                if(!map_b.containsKey(key)){
                    op = false;
                    break;
                }
                    
                if(map_b.get(key) != value){
                    op = false;
                    break;
                }
            }
            
            if(op)
                System.out.println("YES");
            else
                System.out.println("NO");
            
        }
        
    }   
}
