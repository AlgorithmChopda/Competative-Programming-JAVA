/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 *
 * @author Vinay Jain
 */
public class Weekly_377 {
    public int maximizeSquareArea(int m, int n, int[] h, int[] v) {
        int len = h.length + 2;
        int row[] = new int[h.length + 2];
        int col[] = new int[v.length + 2];
        
        Arrays.sort(h);
        Arrays.sort(v);
        
        row[0] = 1; col[0] = 1;
        for(int i = 0 ; i < h.length ; i++) {
            row[i + 1] = h[i];
        }
        
        for(int i = 0 ; i < v.length ; i++) {
            col[i + 1] = v[i];
        }
        
        row[len - 1] = m; col[len - 1] = n;
        
        for(int i = 0 ; i < row.length ; i++) {
            for(int j = 0 ; j < col.length ; j++) {

            }
        }
        
        return 0;
    }
    
    class Temp {
        char ch;
        long cost;
        
        Temp(char ch, long cost) {
            this.ch = ch;
            this.cost = cost;
        }
    }
    HashMap<Character, ArrayList<Temp>> ar;
    public long minimumCost(String source, String target, char[] o, char[] c, int[] cost) {
        ar = new HashMap<>();
        
        for(char ch = 'a' ; ch <= 'z' ; ch++) {
            ar.put(ch, new ArrayList<>());
        }
        
        for(int i = 0 ; i < o.length ; i++) {
            ArrayList<Temp> temp = ar.get(o[i]);
            temp.add(new Temp(c[i], cost[i]));
        }
        
        long ans = 0;
        HashMap<String, Long> map = new HashMap<>();
        for(int i = 0 ; i < source.length() ; i++) {
            String temp = source.charAt(i) + "" + target.charAt(i);
            if(map.containsKey(temp))   ans += map.get(temp);
            else {
                long val = getShortestPathValue(source.charAt(i), target.charAt(i));
                ans += val;
                
                System.out.println(temp + "  : " + val);
                map.put(temp, val);
            }
                
        }
        return 0;
    }
    
    long getShortestPathValue(char src, char dest) {
        PriorityQueue<Temp> pq = new PriorityQueue<Temp>( (Temp a, Temp b) -> a.cost - b.cost);

        long[] dist = new long[26];
        Arrays.fill(dist, Integer.MAX_VALUE);

        pq.add(new Temp(src, 0));
        dist[src - 'a'] = 0;

        while (!pq.isEmpty()) {
          char u = pq.peek().ch;
          pq.poll();

          if(u == dest) return dist[u - 'a'];

          ArrayList<Temp> cur =  ar.get(u);
          for (Temp pair : ar.get(u)) {
            char v = pair.ch;
            long weight = pair.cost;

            if (dist[v - 'a'] > dist[u - 'a'] + weight) {
              dist[v - 'a'] = dist[u - 'a'] + weight;
              pq.add(new Temp(v, dist[v - 'a']));
            }
          }
        }

        return dist[dest - 'a'];
    }
      
      
      public static Map<Character, Integer> dijkstra(HashMap<Character, ArrayList<Temp>> graph, char source) {
        Map<Character, Integer> distanceMap = new HashMap<>();
        PriorityQueue<Map.Entry<Character, Integer>> minHeap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        // Initialize distanceMap with infinity for all nodes except the source
        for (char node : graph.keySet()) {
            distanceMap.put(node, node == source ? 0 : Integer.MAX_VALUE);
        }

        // Initialize minHeap with the source node
        minHeap.add(new AbstractMap.SimpleEntry<>(source, 0));

        while (!minHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = minHeap.poll();
            char current = entry.getKey();
            int currentDistance = entry.getValue();

            if (currentDistance > distanceMap.get(current)) {
                // Skip this iteration if we have a more recent (shorter) distance for this node
                continue;
            }

            for (Temp neighbor : graph.get(current)) {
                char nextNode = neighbor.getDestinationChar();
                int newDistance = currentDistance + neighbor.getCost();

                if (newDistance < distanceMap.get(nextNode)) {
                    // Update the distanceMap and add the neighbor to the minHeap
                    distanceMap.put(nextNode, newDistance);
                    minHeap.add(new AbstractMap.SimpleEntry<>(nextNode, newDistance));
                }
            }
        }

        return distanceMap;
    }
}
