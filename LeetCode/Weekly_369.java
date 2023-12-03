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
public class Weekly_369 {
    public long minSum(int[] ar1, int[] ar2) {
        long sum1 = 0, sum2 = 0;
        int z1 = 0, z2 = 0;
        for(int i = 0 ; i < ar1.length ; i++) {
            if(ar1[i] == 0)  z1++;
            else    sum1 += ar1[i];
        }
        
        for(int i = 0 ; i < ar2.length ; i++) {
            if(ar2[i] == 0) z2++;
            else    sum2 += ar2[i];
        }
        
        if(sum1 == sum2 && (z1 == 0 && z2 == 0))    return sum1;
        
        if(sum2 > sum1) {
            long val1 = sum2 + (long) z2;
            if(z1 == 0) return -1;
            if(sum1 + z1 > val1) {
                if(z2 == 0) return -1;
                else return sum1 + z1;
            }
            return val1;
        }
        else {
            long val1 = sum1 + (long) z1;
            if(z2 == 0) return -1;
            if(sum2 + z2 > val1){
                if(z1 == 0) return -1;
                else return sum2 + z2;
            }
            
            return val1;
        }
        
        
//        if(sum1 < sum2) {
//            if(z1 == 0) return -1;
//            long val1 = sum1 + (long) z1;
//            if(val1 < sum2 + z2) {
//                if(z2 == 0) return -1;
//                return sum2 + z2;
//            }
//            return val1;
//        }
//        else {
//            if(z2 == 0) return -1;
//            long val1 = sum2 + (long) z2;
//            if(val1 < sum1 + z1) {
//                if(z1 == 0) return -1;
//                return sum1 + z1;
//            }
//            return val1;
//        }
            
    }
}

//[2,0,2,0]
// [1,4]
//