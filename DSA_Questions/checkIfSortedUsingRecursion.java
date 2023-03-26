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
public class checkIfSortedUsingRecursion {
    static boolean isSorted(int ar[], int index){
        // if last element of the array
        if(index == ar.length - 1)
            return true;
        if(ar[index] > ar[index+1])
            return false;
        return isSorted(ar, index+1);
    }
            
    public static void main(String args[]){
        int ar[] = {1};
        System.out.println(isSorted(ar, 0));
    }
}
