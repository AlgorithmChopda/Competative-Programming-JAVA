package hackerrank;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Vinay Chopda
 */
public class two_string_Anagram 
{
        public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = bufferedReader.readLine();

        String b = bufferedReader.readLine();

        int res = Result.makeAnagram(a, b);

        System.out.println("\n value = "+res);
      //  bufferedWriter.write(String.valueOf(res));
      //  bufferedWriter.newLine();

        bufferedReader.close();
      //  bufferedWriter.close();
    }
}


class Result {

    /*
     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static int makeAnagram(String a, String b) 
    {
        
        if(a.length() == 0)
            return b.length();
            
        if(b.length() == 0)
            return a.length();
        
        HashMap<Character,Integer> hs = new HashMap<>();
        
        for(int i = 0 ; i < b.length() ; i++){
            if(hs.containsKey(b.charAt(i))){
                hs.put(b.charAt(i),(hs.get(b.charAt(i))+1));
                System.out.println("\n found");
                System.out.println(" FREQ OF "+b.charAt(i)+" : "+hs.get(b.charAt(i)));
                continue;
            }
            hs.put(b.charAt(i),1);
            System.out.println(" FREQ OF "+b.charAt(i)+" : "+hs.get(b.charAt(i)));
        }
        
        
        int cnt = 0;
        for(int i = 0 ; i < a.length() ; i++){
            //System.out.println(" "+a.charAt(i)+" found");
            if(hs.containsKey(a.charAt(i)) && hs.get(a.charAt(i)) > 0){
                System.out.println(" "+a.charAt(i)+" found");
                hs.put(a.charAt(i), (hs.get(a.charAt(i)) -1 ));     
                System.out.println(" FREQ OF "+a.charAt(i)+" : "+hs.get(a.charAt(i)));
                cnt+=2;    
            }
        }
        System.out.println("\n cnt = "+cnt);
         System.out.println("\n cnt = "+(a.length()+b.length()));
        return (a.length() + b.length() - cnt); 
    }

}

