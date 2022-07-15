/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Vinay Chopda
 */
public class Subarray_with_given_sum {
    static ArrayList<Integer> subarraySum(int[] ar, int n, int s) 
    {
        int sum = 0, start = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        int i = 0;
        for(i = 0 ; i < n ; i++)    
        {
            
            sum += ar[i];
            System.out.println("\n sum : "+sum+" index value : "+i);
            if(hs.containsKey(Math.abs(s-sum)) ){
                start = hs.get(Math.abs(s-sum));
                break;
            }
            hs.put(sum, i);
        }
        
        ArrayList<Integer> ar1 = new ArrayList<>();
        ar1.add(start+2);
        ar1.add(i+1);
        
        return ar1;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int ar[] = new int[n];
        for(int i = 0 ; i < n ; i++)
            ar[i] = sc.nextInt();
        ArrayList<Integer> ar1;
        ar1 = subarraySum(ar, n, sum);
        
        System.out.println("\n "+ar[0]);
        System.out.println("\n "+ar[1]);
    }
    
}
