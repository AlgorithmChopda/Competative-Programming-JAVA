/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author Vinay Jain
 */
public class _dontknowthenumber {
    int fun(int i, int ar[], int index) {
        if(i >= ar.length)
            return 0;
        return Math.max(
                fun(i+1, ar, index+1) + ar[i] * index,
                fun(i+1, ar, index)
        );
    }
}
