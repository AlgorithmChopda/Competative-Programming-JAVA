package hackerrank;

import java.util.HashMap;

class Resul{ 

    static String s = "";

    public static void initialize(String s1) {
        s = s1;
    }

    public static int answerQuery(int l, int r) {

        if(l == r)
            return 1;
        String str = s.substring(l-1,r);
        System.out.println("\n str = "+str);
        HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
        
        for(int i = 0 ; i < str.length() ; i++){
            if(hs.containsKey(str.charAt(i)))
                hs.put(str.charAt(i), hs.get(str.charAt(i)) + 1);
            else
                hs.put(str.charAt(i), 1);
        }
        
        int ocnt = 0 , ecnt = 0;
        
        for(int i = 0 ; i < str.length() ; i++){    
            if(hs.containsKey(str.charAt(i))){
                int freq = hs.get(str.charAt(i));
              
                if(freq == 1 || freq % 2 == 1){ // odd frequency
                    ocnt++;
                    freq--;
                }
                
                if(freq > 0)
                    ecnt = (freq / 2) + ecnt;
                
                hs.remove(str.charAt(i));
            }
        }
        
        
        System.out.println("\n ecnt = "+ecnt);
        System.out.println("\n ocnt = "+ocnt);
      
        if(ecnt <= 0)
            return 1;
        
        if(ocnt > 0)
            return ocnt;
        
        if(ecnt == 1)
            return 1;
        else
            return (ecnt * (ecnt-1));
    }

}











public class Hackerrank_PalindromeString {
    public static void main(String args[]){
        Resul.initialize("daadabbadcabacbcccbdcccdbcccbbaadcbabbdaaaabbbdabdbbdcadaaacaadadacddabbbbbdcccbaabbbacacddbbbcbbdbd");
        System.out.println("\n "+Resul.answerQuery(33, 36));
    }
}
