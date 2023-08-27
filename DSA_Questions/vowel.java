/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.HashSet;

/**
 *
 * @author Vinay Jain
 */
public class vowel {
    public static int calculateDesktopProductIDs(char ar[]) {
        int cnt = 0;
        for(char ch : ar) {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')   continue;
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')   continue;
            cnt++;
        }
        
        return cnt;
    }
    
    public static int countOfElements(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        
        for(int i : a) {
            set.add(i);
        }
        
        for(int i : b) {
            set1.add(i);
        }
        
        int cnt = 0;
        for(int i : a) {
            if(!set1.contains(i)) {
                cnt++;
            }
        }
        
        for(int i : b) {
            if(!set.contains(i)) {
                cnt++;
            }
        }
        
        return cnt;
    }
}
