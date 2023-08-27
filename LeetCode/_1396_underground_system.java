/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashMap;

/**
 *
 * @author Vinay Jain
 */
public class _1396_underground_system {
    class UndergroundSystem {
        HashMap<Integer, String[]> status;
        HashMap<String, HashMap<String, int []>> ans;
        // stores src -> dest mapping
        // with sum of time and no of time (n);

        public UndergroundSystem() {
            status = new HashMap<>();
            ans = new HashMap<>();
        }

        public void checkIn(int id, String stationName, int t) {
            status.put(id, new String[] {stationName, Integer.toString(t)});
        }

        public void checkOut(int id, String dest, int t) {
            String temp[] = status.get(id);
            int time = t - Integer.parseInt(temp[1]);
            String src = temp[0];
            
            if(!ans.containsKey(src)) {
                ans.put(src, new HashMap<>());
            }
            
            if(ans.get(src).containsKey(dest)) {
                int ar[] = ans.get(src).get(dest);
                // ar[0] = sum, ar[1] = no of time
                    
                ans.get(src).put(dest, new int[] {ar[0] + time, ar[1] + 1});
            }
            else {
                ans.get(src).put(dest, new int[] {time, 1} );
            }
        }

        public double getAverageTime(String startStation, String endStation) {
            int ar[] = ans.get(startStation).get(endStation);
            return (double) ar[0] / (double) ar[1];
        }
    }
}
