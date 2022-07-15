
package hackerrank;

import java.util.HashMap;

public class MainProgram {
    public static void main(String args[]){
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        hm.put("key1", 1);
        hm.put("key2", 2);
        hm.put("key3", 3);
        hm.put("key4", 4);
        System.out.println(hm.containsKey("key4"));
        
    }
}
