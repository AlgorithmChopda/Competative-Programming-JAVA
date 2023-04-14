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
public class _6326 {
    public int findTheLongestBalancedSubstring(String s) {
        int ans = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            char c = s.charAt(i);
            System.out.print(i+" ");
            if(c == '0') {
                int cnt = 0;
                for(int j = i ; j < s.length() ; j++){
                    System.out.print(j+" ");
                    if(s.charAt(j) == '0'){
                        cnt++;
                    }
                    else{
                        int cnt1 = 0;
                        for(int k = j ; k < s.length() ; k++){
                            System.out.print(j+" "+k);
                            if(s.charAt(k) == '1'){
                                cnt1++;
                            }
                            else{
                                break;
                            }
                        }
                        
                        ans = Math.max(ans, Math.min(cnt, cnt1));
                        break;
                    }
                }
            }
        }
        
        return ans;
    }
}
