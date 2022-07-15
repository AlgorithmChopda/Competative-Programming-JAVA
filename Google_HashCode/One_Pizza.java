package Google_HashCode;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Vinay Chopda
 */
public class One_Pizza {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int client = sc.nextInt();
        
        HashMap<String, Integer>items = new HashMap<>();
        //   list-item  count
        //ArrayList<String> liked = new ArrayList<>();
        //HashSet<String> disliked = new HashSet<>();
        
        for(int i = 0 ; i < client ; i++){
            int n = sc.nextInt();
            for(int j = 0 ; j < n ; j++){
                String list_item = sc.next();
                if(items.containsKey(list_item))
                    items.replace(list_item, items.get(list_item) + 1);
                else
                    items.put(list_item, 1);
            }
            n = sc.nextInt();
            for(int j = 0 ; j < n ; j++){
                String list_item = sc.next();
                if(items.containsKey(list_item))
                    items.replace(list_item, items.get(list_item) - 1);
                else
                    items.put(list_item, -1);
            }
        }

        ArrayList<String> op = new ArrayList<>();      
        for(Map.Entry pair : items.entrySet()){
            int cnt = (int) pair.getValue();
            if(cnt >= 0)
                op.add((String) pair.getKey());
        }
        
        
        FileWriter fWriter = new FileWriter(
                "C:\\Users\\Vinay Chopda\\Desktop\\Google_HashCode\\C.txt");

        fWriter.write(op.size()+" ");
        //System.out.println(op.size()+" ");
        for(String str : op){
            fWriter.write(str+" ");
            //System.out.print(" "+str);
        }
        fWriter.close();
    }   
}


/*
FileWriter fWriter = new FileWriter(
                "C:\\Users\\Vinay Chopda\\Desktop\\Google_HashCode\\C.txt");
 
            
            // Closing the file writing connection
            
        fWriter.write(op.size()+" ");
        for(String str : op){
            fWriter.write(str+" ");
            //System.out.print(" "+str);
        }
        fWriter.close();
*/