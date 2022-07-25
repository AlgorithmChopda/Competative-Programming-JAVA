/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;

/**
 *
 * @author Vinay Jain
 */
public class SUMOFPROD2 {
    static int cnt = 0;
    public static void main(String args[]){
        String str = "1101"; 
        int n = str.length(); 
        SUMOFPROD2 permutation = new SUMOFPROD2(); 
        permutation.permute(str, 0, n-1); 
    }
    
    private void permute(String str, int l, int r) 
    { 
        if (l == r) {
            cnt++;
            System.out.println(cnt+" - "+str); 
        }
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    } 
  
    /** 
    * Swap Characters at position 
    * @param a string value 
    * @param i position 1 
    * @param j position 2 
    * @return swapped string 
    */
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
    
}
