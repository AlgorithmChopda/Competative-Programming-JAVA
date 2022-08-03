/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeforces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javafx.util.Pair;

/**
 *
 * @author Vinay Jain
 */
public class cf_811_d {
    static int cnt = 0;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            String text = sc.next();
            int n = sc.nextInt();
            
            String str[] = new String[n];
            HashMap<String, Integer> hs = new HashMap<>();
            
            for(int i = 0 ; i < n ; i++){
                str[i] = sc.next();
                hs.put(str[i], i);
            }
            
            sort(str, n);
            
            ArrayList<Pair<Integer, Integer>> op = new ArrayList<>();
            boolean ar[] = new boolean[text.length()];
            boolean flag = false;
            
            for(int i = n-1 ; i >= 0 ; i--){
                int index = text.indexOf(str[i], 0);
                while(index != -1){
                    if(cnt == text.length()){
                        flag = true;
                        break;
                    }
                    
                    int prev_cnt = cnt;
                    colorRed(ar, index, str[i].length());
                    if(prev_cnt != cnt)
                        op.add(new Pair(hs.get(str[i]), index));
                    
                    index = text.indexOf(str[i], index+1);
                    
                }
                
                if(flag)
                    break;
                
            }
            
            
            
            if(cnt == text.length()){
                System.out.println(op.size());
                for(int i = 0 ; i < op.size() ; i++)
                    System.out.println( (op.get(i).getKey()+1) +" "+ (op.get(i).getValue()+1) );
            }
            else
                System.out.println("-1");
            
        }
        
    }   
    
    static void sort(String s[], int n) {
        for (int i=1 ;i<n; i++){
            String temp = s[i];
            int j = i - 1;
            while (j >= 0 && temp.length() < s[j].length()){
                s[j+1] = s[j];
                j--;
            }
            s[j+1] = temp;
        }
        
    }

    private static void colorRed(boolean ar[], int start, int end) {
        for(int i = 0 ; i < end ; i++){
            //System.out.println( (start + i) + " : true ");
            if(!ar[start+i])
                cnt++;
            ar[start+i] = true;
        }
    }
    
}
