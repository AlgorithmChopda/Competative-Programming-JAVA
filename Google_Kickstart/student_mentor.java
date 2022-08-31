/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google_Kickstart;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class student_mentor {
    
    public static int BinarySearch(int ar[], int start, int end, int ele){
        
        if(start == end)
            return ar[start] <= ele ? ar[start] : -1;
        
        while(start <= end){
            if(end - start == 1){
                if(ar[end] <= ele)
                    return ar[end];
                if(ar[start] <= ele)
                    return ar[start];
                return -1;
            }
            
            int mid = (start+end)/2;
            if(ar[mid] == ele)
                return mid;
            else{
                if(ar[mid] < ele)
                    start = mid;
                else
                    end = mid;
            }
        }
        
        return -1;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1 ; i <= t ; i++){
            HashMap<Integer, Integer> hs = new HashMap<>();
            int n = sc.nextInt();
            int ar[] = new int[n];
            int temp[] = new int[n];
            
            for(int j = 0 ; j < n ; j++){
                ar[j] = sc.nextInt();
                temp[j] = ar[j];
            }
            
            Arrays.sort(ar);
            
            System.out.print("Case #"+i+": ");
            for(int j = 0 ; j < n ; j++){
                //System.out.println("\n ele "+ar[j]);
                if(hs.containsKey(ar[j]))
                    continue;
                int ele = ar[j] * 2;
                int val = BinarySearch(ar, j+1, ar.length-1, ele);
                if(val == -1){
                    if(j == 0)
                        hs.put(ar[j], val);
                    else
                        hs.put(ar[j], ar[j-1]);
                }
                else
                    hs.put(ar[j], val);
                //System.out.println("\n value : "+hs.get(ar[j]));
            }
            
            for(int j = 0 ; j < n ; j++)
                System.out.print(hs.get(temp[j])+" ");
            
            System.out.println();
       }
    }
}
