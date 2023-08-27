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
    void a(int ar[], int s, int e) {
        if(s < e) {
            int m = s + ( e - s ) / 2;
            a(ar, s, m);
            a(ar, m + 1, e);
            merge(ar, s, m, e);
        }
    }
    
    void merge(int ar[], int s, int m, int e) {
        int i = s, j = m + 1;
        int op[] = new int[e - s + 1], temp = 0;
        
        while(i <= m && j <= e) {
            if(ar[i] < ar[j]) op[temp++] = ar[i++];
            else op[temp++] = ar[j++];
        }
        
        while(i <= m) {
            op[temp++] = ar[i++];
        }
        
        while(j <= e) {
            op[temp++] = ar[j++];
        }
        
        for(int k = 0 ; k < op.length ; k++) {
            ar[s + k] = op[k];
        }
    }
    
    void b(int ar[], int n) {
        for(int i = 0 ; i < n - 1 ; i++) {
            for(int j = 0 ; j < n - i - 1 ; j++) {
                if(ar[j] > ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
    }
    
    void c(int ar[], int n) {
        for(int i = 0 ; i < n - 1 ; i++) {
            for(int j = 0 ; j < n - i - 1 ; j++) {
                if(ar[j] < ar[j + 1]) {
                    int t = ar[j]; 
                    ar[j] = ar[j + 1];
                    ar[j + 1] = t;
                }
            }
        }
    }
    
    boolean isPrime(int n){
        for(int i = 2 ; i * i <= n ; i++) {
           if(n % i == 0)   return false;           
        }
        return true;
    }
    
    static class Practice {
        void temp(int n) {
            
        }
    }
    
    public static void main(String args[]) {
        Practice p = new Practice();
        p.temp(5);
    }
    
}
