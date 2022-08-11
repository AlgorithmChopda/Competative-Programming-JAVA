/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GFG;

/**
 *
 * @author Vinay Jain
 */
public class pots_of_gold_game {
    
    class GfG
    {
        
        public int cal_Max(int ar[], int start, int end){
            if(end - start == 1)
                return Math.max(ar[start], ar[end]);
            if(end - start == 0)
                return ar[start];
            int val = cal_Max(ar, start+1, end);
            int val1 = cal_Max(ar, start, end+1);
            
            return Math.max(val, val1);
            
        }
        
	public int maxCoins(int ar[],int n)
	{
            return cal_Max(ar, 0, n-1);
        }
    }
    
    
    public static void main(String args[]){
        
    }
    
    /*Complete the function below*/
    
    
}
