/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GFG;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Vinay Jain
 */
public class Knight_Walk {
    static class Solution
    {
        class Pair
        {
            int r, c;
            public Pair(int r, int c){
                this.r = r;     this.c = c;
            }
        }
        
        int x[] = {-2, -1, 1, 2, -2, -1, 1, 2 };
        int y[] = {-1, -2, -2, -1, 1, 2, 2, 1};
        
        public void knightWalk(int row, int col, int target[], int dp[][], int n){
            /* //System.out.println("\n row : "+row+" col : "+col);
            if(row == target[0] && col == target[1]){    // if target reached
                //System.out.println("\n Target found ");
                visited[row][col] = true;
                dp[row][col] = 0;
                return 0;
            }
            int min_steps = Integer.MAX_VALUE;
            
            for(int i = 0 ; i < 8 ; i++){
                int r = row+x[i], c = col+y[i];
                //System.out.println("R : "+r+" C : "+c);
                
                if(isSafe(r, c, n)){
                    //System.out.println("\n Safe ");    
                    if(!visited[r][c]){  // this point is not explored yet
                        
                        visited[r][c] = true;
                        int moves = knightWalk(r, c, target, dp, n, visited);
                        if(moves == Integer.MAX_VALUE)  // no possible move from this point
                            dp[r][c] = Integer.MAX_VALUE;
                        else{    // it is possible to reach from here
                            min_steps = Math.min(min_steps, moves+1);
                            dp[r][c] = moves+1;
                        }
                    }
                    else    // moves from this point is already calculated
                        min_steps = Math.min(min_steps, dp[r][c]);
                }
            }
            //System.out.println("\n Minsteps at "+row+" : "+col+"  ->  "+min_steps);
            dp[row][col] = min_steps;
            
            System.out.println("\n point =   "+row+" : "+col);
            for(int i =  0 ; i < 8 ; i++){
                int r = row+x[i], c = col+y[i];
                if(isSafe(r, c, n)){
                    System.out.println("child "+(i+1)+" ->  "+(row+x[i])+" : "+(col+y[i])+" min steps : "+dp[r][c]);
                }
            }
            
            return min_steps;   */
            
            Queue<Pair> qu = new LinkedList<>(); 
            qu.add(new Pair(row, col));   dp[row][col]  = 0;  
            
            while(!qu.isEmpty()){
                
                Pair ele = qu.remove();
                int cur_val = dp[ele.r][ele.c];
                
                for(int i = 0 ; i < 8 ; i++){
                    int r = ele.r + x[i];
                    int c = ele.c + y[i];
                    
                    if(isSafe(r, c, n)){
                        if(dp[r][c] == -1){
                            dp[r][c] = cur_val+1;
                            qu.add(new Pair(r, c));
                        }
                    }
                } 
            }
           
        }
        
        public void swap(int ar[]){
            int temp = ar[0];
            ar[0] = ar[1];
            ar[1] = temp;
        }
        
        public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
        {
            
            swap(KnightPos);
            swap(TargetPos);
            
            int dp[][] = new int[N+1][N+1];
            boolean visited[][] = new boolean[N+1][N+1];
            
            for(int i = 1 ; i <= N ; i++)
                Arrays.fill(dp[i], -1);
            
            knightWalk(KnightPos[0], KnightPos[1], TargetPos, dp, N);
            
            for(int i = 1 ; i <= N ; i++){
                for(int j = 1 ; j <= N ; j++){
                    if(dp[i][j] == -1)
                        System.out.print("9 ");
                    else
                        System.out.print(dp[i][j]+" ");
                }
                System.out.println();
            }
             
            return dp[TargetPos[0]][TargetPos[1]];
        }

        public boolean isSafe(int r, int c, int n) {
            if(r > n || r <= 0 || c > n || c <= 0)
                return false;
            return true;
        }
    }
    
    public static void main(String args[]){
        int n = 8;
        int knight[] = {7, 7};
        int target[] = {1, 5};
       
        System.out.println(new Solution().minStepToReachTarget(knight, target, n));
       
    }
}
