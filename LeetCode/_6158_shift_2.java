/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author Vinay Jain
 */
public class _6158_shift_2 {
    class Solution {
        public String shiftingLetters(String s, int[][] shift) {
            int ar[] = new int[s.length()];
            String op = "";
            for (int[] shift1 : shift) {
                fill(ar, shift1[0], shift1[1], shift1[2] == 1 ? 1 : -1);
            }
            
            for(int i = 0 ; i <s.length() ; i++)
                System.out.print(ar[i]+" ");
            System.out.println("\n");
            
            for(int i = 0 ; i < s.length(); i++){
                ar[i] %= 26;
                int new_val = ((int) s.charAt(i)) + ar[i];
                if(new_val < 97){
                    int new_char = 122-(97-new_val)+1;
                    System.out.print((char)new_char);
                    op += (char)new_char;
                    continue;
                }
                if(new_val > 122){
                    int new_char = 97 + (new_val-122) - 1;
                    System.out.print((char)new_char);
                    op += (char)new_char;
                    continue;
                }
                System.out.println((char) new_val);
                op += (char)new_val;
            }
            
            return op;
        }

        private void fill(int[] ar, int start, int end, int cnt) {
            while(start <= end){
                ar[start] += cnt;
                start++;
            }
        }
    }
}
