package hackerrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hackerrank_validstring {
    
        public static String isValid(String s) {
        HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
      
        int i = 0;
        while(i < s.length()){
            if(!hs.containsKey(s.charAt(i))){
                hs.put(s.charAt(i), 1);
            }
            else{
                hs.put(s.charAt(i), ( hs.get(s.charAt(i)) + 1 ) );
            }
            i++;
        }
    
        HashMap<Integer, Integer> freq = new HashMap<>();
            
        for (Map.Entry mapElement : hs.entrySet()) {
        
            int value = ((int)mapElement.getValue()); // freq
        
            if(!freq.containsKey(value)){
                freq.put(value, 1);
            }
            else{
                freq.put(value, (freq.get(value) + 1) );
            }
        }
        
        if(freq.size() >= 3){
            return "NO";
        }
        
        if(freq.size() == 1){
            return "YES";
        }
        System.out.println("\n hi");
        Iterator hmIterator = freq.entrySet().iterator();
        
        Map.Entry ele = (Map.Entry)hmIterator.next();
        Map.Entry ele1 = (Map.Entry)hmIterator.next();
        
        if(Math.abs((int) ele.getKey() - (int) ele1.getKey()) == 1){ // && (int)ele.getValue() == 1 || (int)ele1.getValue() == 1)
            if((int)ele.getValue() == 1 || (int)ele1.getValue() == 1)            
                return "YES";
            else
                return "NO";
        }
        else 
            return "NO";
    }
     
    public static void main(String args[]){
       System.out.println("\n "+hackerrank_validstring.isValid("xxxaabbccrry"));
    }
        
}
