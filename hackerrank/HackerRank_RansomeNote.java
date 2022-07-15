package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HackerRank_RansomeNote {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String a1 = sc.nextLine();
        String b1 = sc.nextLine();
        
        
        List<String> a = new ArrayList<>(Arrays.asList(a1.split(" ")));
        List<String> b = new ArrayList<>(Arrays.asList(b1.split(" ")));
        
        checkMagazine(a, b);
    }
    
    public static void checkMagazine(List<String> magazine, List<String> note) {
        HashMap<String,Integer> hs = new HashMap<>();
                
        for(String i : magazine){
            if(hs.containsKey(i))
                hs.put(i, (hs.get(i)+1) );
            else
                hs.put(i, 1);
        }
        
        for(String i : note){
            if(!hs.containsKey(i) || hs.get(i) <= 0 ){
                System.out.println("No");
                return;
            }    
            else
                hs.put(i, (hs.get(i) - 1) );  
        }
        System.out.println("Yes");     
    }   
}
