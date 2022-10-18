/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GFG;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Vinay Jain
 */
public class _609_findduplicate {
    public List<List<String>> findDuplicate(String[] paths) {
        
        HashMap<String, ArrayList<String>> hs = new HashMap<>();
        ArrayList<List<String>> op = new ArrayList<>();
        
        for(String path : paths){
            int cur_space = path.indexOf(" ", 0);
            String src = path.substring(0, cur_space);
            cur_space++;
            
            while(true){
                int new_space = path.indexOf(")", cur_space+1);
                if(new_space == -1)
                    break;
                String filename = path.substring(cur_space, new_space+1);
                String text = path.substring(path.indexOf("(", cur_space)+1, new_space);
                
                if(hs.containsKey(text))
                    hs.get(text).add(src+"/"+filename.substring(0, filename.indexOf("(")));
                else{
                    hs.put(text, new ArrayList<>());
                    hs.get(text).add(src+"/"+filename.substring(0, filename.indexOf("(")));
                }
                cur_space = new_space+2;
            }    
        }
        
        for(Map.Entry<String, ArrayList<String>> ele : hs.entrySet())
            if(ele.getValue().size() > 1)
                op.add(ele.getValue());
        
        return op;
    }
}
