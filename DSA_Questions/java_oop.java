
package DSA_Questions;

import java.util.HashMap;

public class java_oop {
    public static void main(String args[]) {
       HashMap<Character, Integer> map = new HashMap<>();
       
       String sentence = "vinay chopda";
       
       for(int i = 0 ; i < sentence.length() ; i++) {
           char ch = sentence.charAt(i);
           if(ch == ' ')    continue;
           if(map.containsKey(ch)) {
               map.put(ch, map.get(ch) + 1);
           }
           else {
               map.put(ch, 1);
           }
       }
       
       for(int i = 0 ; i < sentence.length() ; i++) {
           char ch = sentence.charAt(i);
           
           if(map.containsKey(ch)) {
               System.out.println(ch+" -> "+map.get(ch));
               map.remove(ch);
           }
       }
       
       /*
       
            // Student table name, rollno, .....
       
            select college_name
            from student;
            where isSelected == "true";
            groupBy collegename
      
       
            // Query 2
            
            Inner Join 
       
       */
    }
}
