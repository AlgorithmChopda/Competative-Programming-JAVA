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
 * @author Vinay Chopda
 */
public class march_lunchtime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int test = 0;
        while(t-- > 0){
            test++;
            String co = sc.next();
            String in = sc.next();
           
            HashMap<Character, Integer> fco = new HashMap<>();
            HashMap<Character, Integer> fin = new HashMap<>();
            
            if(co.length() > in.length()){
                System.out.println("Case #"+test+": IMPOSSIBLE");
                continue;
            }
          
            for(int i = 0 ; i < co.length() ; i++){
                if(fco.containsKey(co.charAt(i)))
                    fco.put(co.charAt(i), fco.get(co.charAt(i)) + 1 );
                else
                    fco.put(co.charAt(i), 1);
            }
            
            for(int i = 0 ; i < in.length() ; i++){
                if(fin.containsKey(in.charAt(i)))
                    fin.put(in.charAt(i), fin.get(in.charAt(i)) + 1 );
                else
                    fin.put(in.charAt(i), 1);
            }
            
            char a;         
            for(a = 'a' ; a <= 'z' ; a++){
                int fe = fco.get(a) == null ? 0 : fco.get(a);
                int fe1 = fin.get(a) == null ? 0 : fin.get(a);
            
                if(fe > fe1)
                    break;
            }
            
            if(a <= 'z'){
                System.out.println("Case #"+test+": IMPOSSIBLE");
                continue;
            }
            
            
            for(a = 'A' ; a <= 'Z' ; a++){
                int fe = fco.get(a) == null ? 0 : fco.get(a);
                int fe1 = fin.get(a) == null ? 0 : fin.get(a);
                
                //System.out.println(" "+a+" : "+fe);
                //System.out.println(" "+a+" : "+fe1);
                
                if(fe > fe1)
                    break;
            }
    
            
            if(a > 'Z')
                System.out.println("Case #"+test+": "+(in.length() - co.length()) );
            else
                System.out.println("Case #"+test+": IMPOSSIBLE");
            
            
        }
    }
}





/*for (Map.Entry ele : fco.entrySet()) {
                char key = (char) ele.getKey();
                
                int fe = (int) ele.getValue();
                int fe1 = fin.get(key) == null ? 0 : fin.get(key);
                
                System.out.println(key+" : "+fe);
                System.out.println(key+" : "+fe1);
                
                if(fe > fe1)
                    break;
               
                diff += (fe1 - fe);
                cnt++;
            }*/