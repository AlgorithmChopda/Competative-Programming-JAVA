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
public class remove_duplicate {
    public static void main(String args[]){
        int a[] = {1,3,4,6,8};
        int b[] = {2,5,7,9,10,11};
        
        int op[] = new int[100];
        int index = 0;
        
        int i = 0 , j = 0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j])
                op[index++] = a[i++];
            else
                op[index++] = b[j++];
        }
        
        // one array is over and one is remaning
        while( i < a.length) {
            op[index++] = a[i++];
        }
        
        while(j < b.length){
            op[index++] = b[j++];
        }
        
        System.out.println("\n Array : ");
        for(int k = 0 ; k < a.length + b.length ; k++)
            System.out.print(op[k]+" ");
        System.out.println("\n ");
    }
}
