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
public class _2416_sumofprefix {
    class Solution {
        
        class Tree {
            Tree child[] = new Tree[26];
            int cnt[] = new int[26];
            
            public Tree(){
                for(int i = 0 ; i < 26 ; i++){
                    child[i] = null;
                    cnt[i] = 0;
                }
            }
            
            void push(String s, Tree root, int index){
                if(index >= s.length())
                    return;
                int i = s.charAt(index) - 97;
                if(root.child[i] == null)
                    root.child[i] = new Tree();
                root.cnt[i]++;
                push(s, root.child[i], index+1);
            }
            
            int count(String s, Tree root, int index){
                if(index >= s.length())
                    return 0;
                int i = s.charAt(index) - 97;
                return root.cnt[i] + count(s, root.child[i], index+1);
            }
        }
        
        public int[] sumPrefixScores(String[] words) {
            Tree root = new Tree();
            for(String s : words)
                root.push(s, root, 0);
            
            int op[] = new int[words.length];
            int k = 0;
                    
            for(String s : words){
                op[k] = root.count(s, root, 0);
                k++;
            }
            
            return op;  
        }
    }
}
