/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashMap;
import java.util.TreeMap;
import javafx.util.Pair;

/**
 *
 * @author Vinay Jain
 */
public class _2353_designfoodratingsystem {
    class FoodRatings {
        
        // for storing cusine and their food item in the sorted order
        HashMap<String, TreeMap<Integer, String>> hm = new HashMap<>();
        
        // for mapping between food item and food cuisine
        HashMap<String, Pair<String, Integer> > food_map = new HashMap<>();
        
        public FoodRatings(String[] food, String[] cuisine, int[] rating) {
            for(int i = 0 ; i < food.length ; i++){
                
                food_map.put(food[i],  new Pair(cuisine[i], rating[i]) );
                
                if(hm.containsKey(cuisine[i]))
                    hm.get(cuisine[i]).put(rating[i], food[i]);
                else{
                    hm.put(cuisine[i], new TreeMap<>());
                    hm.get(cuisine[i]).put(rating[i], food[i]);
                }
            }
             
            hm.forEach((key, value) ->
                    System.out.println(key+"\n"+value+"\n\n")
            );  
            
            hm.forEach((key, value) ->
                    System.out.println(key+"\n"+value+"\n\n")
            );  
            
        }

        public void changeRating(String food, int new_rating) {
            
            String cuisine = food_map.get(food).getKey();
            int prev_rating = food_map.get(food).getValue();
            
            if(prev_rating == new_rating){
                
            }
            
            hm.get(cuisine).remove(prev_rating);
            hm.get(cuisine).put(new_rating, food);
            
            food_map.replace(food, new Pair(cuisine, new_rating));
        }

        public String highestRated(String cuisine) {
            return hm.get(cuisine).lastEntry().getValue();
        }
    }
}
