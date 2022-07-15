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
 * @author Vinay Chopda
 */
public class ANTI_PAL {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String str = sc.next();
            if(n%2 != 0){
                System.out.println("NO");
                continue;
            }
            String op = "";
            boolean flag = false;
            HashMap<Character, Integer> hs = new HashMap<>();
            int i = 0;
            for(; i < n ; i++){
                char ele = str.charAt(i);
                if(hs.containsKey(ele)){
                    int freq = hs.get(ele);
                    if(freq + 1 <= n/2)
                        hs.put(ele, freq + 1);
                    else{
                        System.out.println("NO");
                        break;
                    }
                }
                else
                    hs.put(ele, 1);
            }
            if(i != n)
                continue;
            
            int freq = 0;
            char ele;
            String end = "";
            for (Map.Entry<Character,Integer> entry : hs.entrySet()){
                freq = entry.getValue();
                ele = entry.getKey();
                if(flag){    
                    while(freq != 0){
                        op += ele;
                        freq--;
                    }
                }
                else
                {
                    if(freq + op.length() <= n/2){
                        while(freq != 0){
                            op += ele;
                            freq--;
                        }
                        
                        if(freq + op.length() == n/2)
                            flag = true;
                    }
                    else{
                        while(op.length() != n/2){
                            op += ele;
                            freq--;
                        }
                        while(freq != 0){
                            end += ele;
                            freq--;
                        }
                        flag = true;
                    }
                    
                }
            }
            
            System.out.println("YES\n"+(op+end));            
        }
        
    }
}
