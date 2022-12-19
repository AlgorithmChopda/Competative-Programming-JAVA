/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Vinay Jain
 */
public class _6260 {
    
    public static void main(String args[]){
        int ar[] = new int[5];
        Arrays.sort(ar);
    }
    
    boolean function(int ar[], int temp[]){
        for(int i = 0 ; i <= ar.length - temp.length ; i++){
            boolean flag = false;
            for(int j = i ; j < i+temp.length ; i++){
                if(ar[j] != ar[j-i]){
                    flag = false;
                    break;
                }
            }
            if(!flag)   return true;
        }
        return true;
    }
    
    void function_reverse(int ar[]){
        int n = ar.length;
        for(int i = 0, j = ar.length - 1 ; i < j ; i++, j--){
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
        }
    }

    
    static void mergeSort(int ar[]){
        helper_mergeSort(ar, 0, ar.length-1);
        System.out.println(Arrays.toString(ar));
    }
    
    static void helper_mergeSort(int ar[], int s, int e){
        if(s == e)  return;
        int mid = (s + e) / 2;
        helper_mergeSort(ar, s, mid);
        helper_mergeSort(ar, mid+1, e);
        
        merge(ar, s, e, mid);
    }
    
    static void merge(int ar[], int start, int end, int mid){
        int op[] = new int[(end - start + 1)];
        int k = 0;
        int i = start, j = mid+1;
        while(i <= mid && j <= end){
            if(ar[i] < ar[j]){
                op[k] = ar[i];
                i++;
            }
            else{
                op[k] = ar[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            op[k] = ar[i];
            i++;    k++;
        }
        while(j <= end){
            op[k] = ar[j];
            j++;    k++;
        }
        
        
        for(i = start, k = 0; i <= end ; i++, k++)
            ar[i] = op[k];
    }
    public int[] maxPoints(int[][] mat, int[] q) {
        int r = mat.length;
        int c = mat[0].length;
        int max = -1;
        for(int i = 0 ; i < r ; i++)
            for(int j = 0 ; j < c ; j++)
                max = Math.max(max, mat[i][j]);
        
        int ar[] = new int[max];
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                ar[mat[i][j]]++;
            }
        }
        
        for(int i = 1 ; i < max ; i++)
            ar[i] += ar[i-1];
        
        int op[] = new int[q.length];
        for(int i = 0 ; i < q.length ; i++){
            
        }
        
        
        ArrayList<ArrayList<Integer>> o = new ArrayList<>();
        Collections.sort(o.get(0), (a, b) -> b-a);
        o.add(new ArrayList<>(Arrays.asList(mat[0][1], mat[0][2])));
        
        return new int[] {0, 1};
    }
}
























