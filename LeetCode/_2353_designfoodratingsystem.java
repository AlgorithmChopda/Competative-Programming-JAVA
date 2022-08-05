/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;
import javafx.util.Pair;


/**
 *
 * @author Vinay Jain
 */
public class _2353_designfoodratingsystem {
    class FoodRatings {
        
        HashMap<String, TreeMap<Integer, LinkedList<String>> > map = new HashMap<>();
        HashMap<String, Pair<Integer, String> > food_map= new HashMap<>();
        
        public FoodRatings(String[] food, String[] cui, int[] ra) {
            
            for(int i = 0 ; i < food.length ; i++){
                food_map.put(food[i], new Pair(ra[i], cui[i]));
                if( map.containsKey(cui[i]) ){
                    if( map.get(cui[i]).containsKey(ra[i]) )
                        map.get(cui[i]).get(ra[i]).add(food[i]);
                    else{
                        map.get(cui[i]).put(ra[i], new LinkedList<>());
                        map.get(cui[i]).get(ra[i]).add(food[i]);
                    }
                }
                    
                else{
                    map.put(cui[i], new TreeMap<>());  
                    map.get(cui[i]).put(ra[i], new LinkedList<>()); 
                    map.get(cui[i]).get(ra[i]).add(food[i]);
                }
            }
            
            
            
        }
        
        public void changeRating(String food, int new_rating) {
            int old_rating = food_map.get(food).getKey();
            String cuisine = food_map.get(food).getValue();
            map.get(cuisine).get(old_rating).remove(food);
            if( map.get(cuisine).containsKey(new_rating) )
                map.get(cuisine).get(new_rating).add(food);
            else{
                map.get(cuisine).put(new_rating, new LinkedList<>());
                map.get(cuisine).get(new_rating).add(food);
            }
            
            if(map.get(cuisine).get(old_rating).isEmpty())
                map.get(cuisine).remove(old_rating);
            
            food_map.put( food, new Pair(new_rating, cuisine) );
            
            
            for(String str : map.keySet())
                System.out.println(str + " : " + map.get(str));
        }
        
        public String highestRated(String cuisine) {
            return small_Lexi( map.get(cuisine).get(map.get(cuisine).lastKey()) );
        }

   
        private String small_Lexi(LinkedList<String> food) {
            String min = food.getFirst();
            for(String food_item : food){
                if(food_item.compareTo(min) < 0)
                    min = food_item;
            }
            
            return min;
        }
        
    }    
}