/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Vinay Chopda
 */

class A implements Comparable<A> {
    int t, a;

    public A(int t, int a) {
        this.t = t;
        this.a = a;
    }
    @Override
    public int compareTo(A o)
    {
        if(this.a <= o.a)
            return this.a-o.a;
        return o.a - this.a;
    }
}

class D implements Comparable<D>{

    public D(int t, int d) {
        this.t = t;
        this.d = d;
    }
    int t, d;
    @Override
    public int compareTo(D o)
    {
        if(this.d <= o.d)
            return this.d - o.d;
        return o.d - this.d;
    }
}


public class TCS_B {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        A ar[] = new A[n];        // Arrival
        D de[] = new D[n+1];        // Departure
        
        for(int i = 0 ; i < n ; i++){
            int train = sc.nextInt();
            int a = sc.nextInt();
            int d = sc.nextInt();
            
            ar[i] = new A(train, a);
            de[i] = new D(train, (a+d));
        }
            
        Arrays.sort(ar);
        Arrays.sort(de);
        
        int d_p = -1, d_t = -1, a_p = 1;
        HashMap<Integer, Integer> platform = new HashMap<>();
        for(int i = 0 , j = 0 ; i != ar.length && j != de.length;){
            int ar_time = ar[i].a;
            int de_time = de[j].d;
            
            if(ar_time < de_time){
                    platform.put(a_p, 1);
            }
            else{
                if(ar_time == de_time){
                    
                }
                
            }    
        }
    }
}
