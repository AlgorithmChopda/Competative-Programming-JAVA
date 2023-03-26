/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

/**
 *
 * @author Vinay Jain
 */
public class binarySearch {
    
    // returns the index of the key
    int binarySearch(){
        int ar[] = new int[]{1,2,3,4,5,6,7};
        int key = 5;
        
        int s = 0, e = ar.length-1;
        while(s <= e){
            int mid = (s + e) / 2;
            if(ar[mid] == key)  return mid;
            if(ar[mid] < key)    s = mid + 1;
            else e = mid - 1;
        }
        return s;   
    }
    
    // find the index of the last occurence of the key
    int binarySearchEnd(int ar[], int key){
        int s = 0, e = ar.length- 1;
        while(s <= e){
            int mid = (s + e) / 2;
            if(ar[mid] == key || ar[mid] < key){
                s = mid + 1;
            }
            else
                e = mid - 1;
        }
        if( s == 0 || ar[s-1] != key)
            return -1;
        return s;
    }
    
    // find the index of the first occurence of the key
    int binarySearchStart(int ar[], int key){
        int s = 0, e = ar.length-1;
        while(s <= e){
            int mid = (s + e) / 2;
            if(ar[mid] == key || ar[e] > key )  e = e - 1;
            else    s = s - 1;
        }
        if(e == ar.length - 1 || ar[e+1] != key)  return -1;
        return e + 1;
    }
}
