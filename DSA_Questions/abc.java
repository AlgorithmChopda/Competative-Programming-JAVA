/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

/**
 *
 * @author Vinay Jain
 */

public class abc {
    
    
    public static void main(String args[]){
        int k = 65;
        int cnt = 1, i = 0;
        for(i = 2 ; i <= k; i++){    
            String str = Integer.toBinaryString(i);
            StringBuilder s = new StringBuilder(str);
            s.reverse();
            for(int j = 0 ; j < s.length() ; j += 2){
                if(s.charAt(j) == '1'){
                    //System.out.println("\n 1 foudt at "+j+" : "+i);
                    cnt++;
                }
            }
            if(cnt > k){
                i--;
                break;
            }
            //System.out.println("\n cnt : "+cnt+" at : "+i);
        }
        System.out.println(i);
    }
}
