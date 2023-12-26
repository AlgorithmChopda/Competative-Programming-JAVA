/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Vinay Jain
 */
public class Weekly_376 {
    public int[][] divideArray(int[] ar, int k) {
        Arrays.sort(ar);
        ArrayList<int[]> temp = new ArrayList<>();
        for(int i = 2 ; i < ar.length ; i += 2) {
//            if(ar[i] == ar[i - 1] && ar[i] == ar[i - 2]) {
//                return new int[0][0];
//            }
            if(ar[i] - ar[i - 1] >= k && ar[i - 1] - ar[i - 2] >= k) {
                return new int[0][0];
            }
            
            temp.add(new int[] {ar[i - 2], ar[i - 1], ar[i]});
        }
        
        int op[][] = new int[temp.size()][k];
        
        for(int i = 0 ; i < temp.size() ; i++) {
            for(int j = 0 ; j < k ; j++) {
                op[i][j] = temp.get(i)[j];
            }
        }
        
        return op;
    }
    
    public static boolean isPalindrome(long num) {
        long originalNumber = num;
        long reversedNumber = 0;

        while (num > 0) {
            long digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }

        return originalNumber == reversedNumber;
    }
    
    public static long findMedian(int[] ar) {
        if(ar.length / 2 == 0)  return ar[ar.length / 2];
        
        int a1 = ar.length / 2 - 1;
        int a2 = ar.length / 2;
        long val = (ar[a1] + ar[a2]) / 2;
        
        return val;
    }
    
    public long minimumCost(int[] ar) {
        Arrays.sort(ar);
        long no = findMedian(ar);
        
        long left = no, right = no;
        while(left >= 1 && !isPalindrome(left)) {
            left--;
        }
        
        while(!isPalindrome(right)) {
            right++;
        }
        
        long ans = 0, ans1 = 0;
        for(int i : ar) {
            ans += (Math.abs(i - left));
            ans1 += (Math.abs(i - right));
        }
        
        return Math.min(ans, ans1);
    }
    
    public String temp(String sen) {
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


