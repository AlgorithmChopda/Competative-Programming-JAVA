package LeetCode;

public class weekly_346 {
    public int minLength(String s) {
        StringBuilder str = new StringBuilder(s);
        boolean flag = false;
        while(true) {
            flag = false;
            for(int i = 0; i < str.length() - 1; i++) {
                if(str.charAt(i) == 'A' && str.charAt(i+1) == 'B') {
                    str.delete(i, i+2);
                    flag = true;
                    break;
                }
                if(str.charAt(i) == 'C' && str.charAt(i+1) == 'D') {
                    str.delete(i, i+2);
                    flag = true;
                    break;
                }
            }
            
            if(!flag)   break;
        }
        
        return str.length();    
    }
    
    
    
    
    
    public String makeSmallestPalindrome(String s) {
        StringBuilder str = new StringBuilder(s);
        for(int i = 0 , j = str.length() - 1 ; i < j ; i++, j--) {
            if(str.charAt(i) == str.charAt(j))  continue;
            if(str.charAt(i) < str.charAt(j)) {
                str.setCharAt(j, str.charAt(i));
            }
            else {
                str.setCharAt(i, str.charAt(j));
            }
        }
        
        return str.toString();
    }
    
    boolean check(String s, int index, int sum) {
        
        if(sum < 0)  return false;
        System.out.println(sum);
        if(sum == 0) return true;
        int no = 0;
        int val = 1;
        for(int i = index ; i >= 0 ; i--) { 
            no = (Integer.parseInt(s.charAt(i) + "")) * val + no;
            if(check(s, i-1, sum - no)) return true;
            val *= 10;
        }
        
        return false;
    }
    
    public int punishmentNumber(int n) {
        int ans = 1;
        for(int i = 2 ; i <= n ; i++) {
            String temp = Integer.toString(i*i);
            if(check(temp, temp.length() - 1, i)) {
                ans += (i * i);
            }
        }
        
        return ans;
    }
    
}
