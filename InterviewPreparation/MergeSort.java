/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewPreparation;

/**
 *
 * @author Vinay Jain
 */
public class MergeSort {
    static void mergeSort(int ar[], int start, int end) {
        if(start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(ar, start, mid);
            mergeSort(ar, mid + 1, end);
            
            merge(ar, start, mid, end);
        }
    }
    
   static void merge(int ar[], int s, int mid, int e) {
       int i = s, j = mid + 1;
       int temp[] = new int[e - s + 1];
       int index = 0;
       
       while(i <= mid && j <= e) {
           if(ar[i] < ar[j]) {
               temp[index++] =  ar[i++];
           }
           else {
               temp[index++] = ar[j++];
           }
       }
       
       while(i <= mid) {
           temp[index++] = ar[i++];
       }
       while(j <= e) {
           temp[index++] = ar[j++];
       }
       
       for(i = 0 ; i < temp.length ; i++) {
           ar[i + s] = temp[i];
       }
   }
   
    public static void main(String args[]) {
        int ar[] = new int [] {1};
        mergeSort(ar, 0, ar.length - 1);
        for(int i : ar) {
            System.out.print(i + " ");
        }
    }
}
