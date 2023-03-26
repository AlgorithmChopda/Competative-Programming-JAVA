/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vinay Jain
 */
public class _93_ipaddress {
    
    public void formIpAddress(char ch[], int index, int no, ArrayList<String> ar, List<String> global)
    {
        if(no == 5){
            if(index == ar.size()){
                String op = ar.get(0);
                for(int i = 1 ; i < ar.size() ; i++)
                    op += "." + ar.get(i);
                global.add(op);
            } 
            return;
        }    
        
        if(ch[index] == '0'){
            ar.add(ch[index] + "");
            formIpAddress(ch, index+1, no+1, ar, global);
            return;
        }
        
        // to initialize the current no string
        if(ar.size() < no)
            ar.add(""); 
        String cur = ar.get(no);
        for(int i = index ; i < ch.length ; i++){
            cur  += ch[index];
            int n = Integer.parseInt(cur);            
            if(n <= 255){
                ar.add(cur);
                
                formIpAddress(ch, index+1, no+1, ar, global);
            }
            else
                return;
        }
    }
    
    public List<String> restoreIpAddresses(String s) {
        List<String> global = new ArrayList<String>();
        formIpAddress(s.toCharArray(), 0, 1, new ArrayList<String>(), global);
        return global;
    }
}
