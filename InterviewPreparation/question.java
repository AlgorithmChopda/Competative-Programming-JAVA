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
public class question {
    static class Practice {
        void bubble(int ar[], int k) {
            int n = ar.length;
            int val = 0;
            for(int i = 0 ; i < n ; i++) {
                for(int j = 0 ; j < n - 1 ; j++) {
                    if(ar[j] > ar[j + 1]) {
                        int temp = ar[j];
                        ar[j] = ar[j + 1];
                        ar[j + 1] = temp;
                    }
                }
                if(val == k)
                    break;
                val++;
            }
            System.out.println(ar[ar.length - k]);
            
            for(int i = n - 2 ; i <= ar.length ; i++) {
                
            }
        }
        void temp(int ar[], int s, int e) {
            if(s < e ) {
                int mid = s + ( e - s ) / 2;
                temp(ar, s, mid);
                temp(ar, mid + 1, e);
                merge(ar, s, mid, e);
            }
        }
        
        void merge(int ar[], int s, int mid, int e) {
            int i = s, j = mid + 1, index = 0;
            int op[] = new int[e - s + 1];
            
            while(i <= mid && j <= e) {
                if(ar[i] < ar[j]) op[index++] = ar[i++];
                else op[index++] = ar[j++];
            }
            while(i <= mid) {
                op[index++] = ar[i++];
            }
            while(j <= e) {
                op[index++] = ar[j++];
            }
            for(int k = 0; k < op.length ; k++) {
                ar[s + k] = op[k];
            }
        }
        
        void distinct(int ar[]) {
            int max = 0, min = Integer.MAX_VALUE;
            for(int i : ar) {
                max = Math.max(i, max);
                min = Math.min(i, min);
            }
            
            int a[] = new int[max - min + 1];
            for(int i : ar) {
                if(a[i - min] == 0) {
                    System.out.print(i + " ");
                    a[i - min] = 1;
                }
            }
        }
        
        void print(int ar[], int n) {
            int op[] = new int[n];
            op[0] = 0;
            
            for(int i = 1 ; i < n ; i++) {
                if(ar[i] == ar[i-1]) {
                    op[i] = op[i - 1] + 1;
                }else {
                    op[i] = 0;
                }
            }
            
            for(int i : op) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static void main(String args[]) {
        Practice p = new Practice();
        int ar[] = new int[] {3,2,1,1,2,1,223,2, -1};
        p.bubble(ar, 5);
    }
    
    
    
    
}
