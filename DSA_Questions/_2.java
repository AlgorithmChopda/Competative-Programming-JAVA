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
public class _2 {
    
    static boolean check(String s, int index, int sum) {
        
        if(sum < 0)  return false;
        System.out.println(sum);
        if(sum == 0) return true;
        int no = 0;
        int val = 1;
        for(int i = index ; i >= 0 ; i--) { 
            no = (Integer.parseInt(s.charAt(i) + "")) * val + no;
//            System.out.println(no);
            if(check(s, i-1, sum - no)) return true;
            val *= 10;
        }
        
        return false;
    }
    
    
    public static void main(String args[]){
        System.out.println(check("100", 2, 11));
                
    }
}
