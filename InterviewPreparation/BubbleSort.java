/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewPreparation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Vinay Jain
 */
public class BubbleSort {
    static void bubbleSort(int ar[]) {
        int n = ar.length;
        for(int i = 0 ; i < n - 1 ; i++) {
            boolean isSwaped = false;
            for(int j = 0 ; j < n - i - 1 ; j++) {
                if(ar[j] > ar[j+1]) {
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j + 1] = temp;
                    isSwaped = true;
                }
            }
            
            if(!isSwaped) return;
        }
    }
    
    static void selectionSort(int ar[]) {
        int n = ar.length;
        for(int i = 0 ; i < n - 1 ; i++) {
            int minIndex = i;
            for(int j = i + 1 ; j < n ; j++) {
                if(ar[minIndex] > ar[j]) {
                    minIndex = j;
                }
            }
            
            int temp = ar[minIndex];
            ar[minIndex] = ar[i];
            ar[i] = temp;
        }
    }
    
    static void insertionSort(int ar[]) {
        int n = ar.length;
        for(int i = 1 ; i < n ; i++) {
            if(ar[i] < ar[i-1]) {
                int j = i;
                while(j > 0 && ar[j] < ar[j - 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j - 1];
                    ar[j - 1] = temp;
                    
                    j--;
                }
            }
        }
    }
    
    static void quickSortUtil(int low, int high, int ar[]) {
        
    }
    static void quickSort(int ar[]) {
        int n = ar.length;
//        int pivot = getPivot(n);
    }
    
    static void print(int ar[]) {
        for(int i : ar) {
            System.out.print(i + " ");
        }
    }
    
    public static void main(String args[]) {
        int ar[] = {5,4,3,3,3,3,3,2,2,2,22,1};
        // bubbleSort(ar);
        // selectionSort(ar);
        
        insertionSort(ar);
        print(ar);
    }
    
    static void solve(int ar[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : ar) set.add(i);
        int noOfUnique = set.size();
        set.clear();
        
        int i = 0, j = 0, currentUnique = 0, ans = Integer.MAX_VALUE;
        while(i <= j) {
            if(currentUnique == noOfUnique) {
//                while
//                ans = Math.min(ans, j - i);
//                // resize window.
            }
            
            if(set.contains(ar[j])) {
                j++;
            }
            else {
                set.add(ar[j]);
                currentUnique++;
                j++;
            }
        }
    }
    
    
    public int maximumBeauty(int[] ar, int k) {
        int n = ar.length;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0 ; i < n ; i++) {
            if(map.containsKey(ar[i] - k)) {
                map.put(ar[i] - k, map.get(ar[i] - k) + 1);
            }
            else {
                map.put(ar[i] - k, 1);
            }
            
            if(map.containsKey(ar[i] + k + 1)) {
                map.put(ar[i] + k + 1, map.get(ar[i] + k + 1) + 1);
            }
            else {
                map.put(ar[i] + k + 1, 1);
            }
        }
        
        int result = 0;
        int temp = 0;
        
        for(Map.Entry<Integer, Integer> ele : map.entrySet()) {
            int a = ele.getKey();
            int b = ele.getValue();
            
            temp += b;
            result = Math.max(result, temp);
        }
        
        return result;
    }
    
    
    public int minimumIndex(List<Integer> a) {
        Map<Integer,Integer> map = new HashMap<>();
        int erok = -1,n=a.size();
        for(int i:a){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)*2>n){
                erok=i;
            }
        }
        int f=0,pref=map.get(erok);
        for(int i =0; i<n; i++){
            if(a.get(i) == erok){
                f++;pref--;
                if(f*2>(i+1) && pref*2>(n - (i+1))){
                    return i;
                }
            }
        }
        return -1;
        
    }
    
    
    public int minimumIndex1(List<Integer> list) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < list.size() ; i++) {
            int ele = list.get(i);
            if(map.containsKey(ele)) {
                map.put(ele, map.get(ele) + 1);
            }
            else {
                map.put(ele, 1);
            }
            
        }
        
        return 0;
    }
}
   
