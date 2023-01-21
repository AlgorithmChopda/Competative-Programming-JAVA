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
public class _6269 {
    public int closetTarget(String[] words, String target, int start) {
        if(words[start].equals(target)) return 0;
        String s[] = new String[words.length * 2];
        int k = 0;
        for(int i = 1 ; i <= 2 ; i++){
            for(String w : words)
                s[k++] = w;
        }
        
        int index = -1;
        for(int i = (words.length + (start)) ; i >= 0 ; i--){
            if(s[i].equals(target)){
                index = (words.length + (start)) - i;
                break;
            }
        }
        
        if(index == -1) return -1;
        
        int index1 = -1;
        for(int i = start+1; i < s.length ; i++){
            if(s[i].equals(target)){
                index1 = (i - start);
                break;
            }
        }
        
        return Math.min(index, index1);
    }
}
