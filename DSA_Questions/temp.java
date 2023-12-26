/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

/**
 *
 * @author Vinay Chopda
 */
public class temp {
    public static void main(String args[]) {
        System.out.println(abc("fun&!! time"));
    }
    
    public static String abc(String sen) {
        String[] words = sen.split("\\s+");

        String ans = "";
        int len = 0;

        for (String word : words) {
            String w = word.replaceAll("[^a-zA-Z]", "");
            if (w.length() > len) {
                len = w.length();
                ans = w;
            }
        }

        return ans;
    }
}
