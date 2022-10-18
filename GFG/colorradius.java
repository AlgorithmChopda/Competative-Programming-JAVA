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
public class colorradius {
    public static int finLength(int n, int[] c, int[] r) {
        int i = 0, j = 1;
        int index[] = new int[n];
        
        index[0] = -1;
        
        while(j < n){
            if(c[i] == c[j] && r[i] == r[j]){
                c[i] = c[j] = r[i] = r[j] = -1;
                if(index[i] == -1){
                    i = j+1;
                    j += 2;
                }
                else{
                    i = index[i];
                    j++;
                }
            }
            else{
                index[j] = i;
                i++;    j++;
            }
        }
        
        int cnt = 0;
        for(i = 0 ; i < n ; i++)
            if(c[i] != -1)
                cnt++;
        
        return cnt;
    }

    public static void main(String args[]){
        int a[] = {2, 2, 3};
        int b[] = {2, 2, 5};
        System.out.println("\n "+finLength(a.length, a, b));
    }
}

