/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Vinay Jain
 */
public class _2101 {
    public int maximumDetonation(int[][] bomb) {
        // int [] => left, right, top, bottom;
        Queue<int []> pq = new PriorityQueue<>( (int a[], int b[]) -> {
            if(a[0] != b[0])    return a[0] - b[0];
            return a[3] - b[3];
        });

        int n = bomb.length;
        for(int i = 0 ; i < n ; i++) {
            int x = bomb[i][0], y = bomb[i][1], c = bomb[i][2];
            pq.add(new int[] {x - c, x + c, y + c, y - c});
        }

        while(!pq.isEmpty()) {
            int ar[] = pq.remove();
            System.out.println(ar[0]);
        }

        return 0;
    }
}
