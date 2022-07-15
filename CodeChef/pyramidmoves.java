/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;

import java.util.Scanner;

/**
 *
 * @author Vinay Chopda
 */
public class pyramidmoves {

     static int binomialCoeff(int n, int k)
    {
        int res = 1;
 
        // Since C(n, k) = C(n, n-k)
        if (k > n - k)
            k = n - k;
 
        // Calculate value of
        // [n * (n-1) *---* (n-k+1)] / [k * (k-1) *----* 1]
        for (int i = 0; i < k; ++i) {
            res = ((res * (n - i)) % 1000000007);
            res /= (i + 1);
        }
 
        return (res);
    }
    
    public static int last_element(int level) {
        return ((level + 1) * level) / 2;
    }
    
    public static int getIndex(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2 || n == 3) {
            return 2;
        }
        int start_level = 2;
        int end_level = (int) Math.ceil(Math.sqrt(2 * n));
        int mid = 0;
        int i = 0;
        while (i < 6 && start_level <= end_level) {
            mid = (start_level + end_level + 1) / 2;
            if (last_element(mid) >= n && last_element(mid - 1) < n) {
                break;
            } else {
                if (last_element(mid) > n) {
                    end_level = mid;
                } else {
                    start_level = mid;
                }
            }
            i++;
        }
        return mid;
    }

    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);

        /*int fact[] = new int[10000005];
        fact[0] = 1;
        fact[1] = 1;
        
        for(int i = 2 ; i <= 100000; i++){
            fact[i]  = (((fact[i-1] * i)) % 10000000);    
        }
        */
        int t = sc.nextInt();
        while (t-- > 0) {
            int s = sc.nextInt();
            int n = sc.nextInt();
            if (s > n) {
                System.out.println("0");
                return;
            }
            int s_level = getIndex(s);
            int s_index = (s - (last_element(s_level - 1)));

            int n_level = getIndex(n);
            int n_index = (n - (last_element(n_level - 1)));

            System.out.println("\n s level : "+s_level+" s index : "+s_index);
            System.out.println("\n e level : "+n_level+" e index : "+n_index);
            
            int l = n_level - s_level;      // level    n = l
            int k = n_index - s_index;      // index    r = k

            System.out.println("\n "+(0 % 1000000007));
            if (l <= 0 || k < 0 || k > l) {
                System.out.println("0");
                return;
            }
System.out.println("\n "+(0 % 1000000007));
            
    /*         int p1 = 1000000007;
            
            int fn1 = fact[l];
            int fk1 = fact[k];
            int mul = fk1 * fact[l - k];
            
            int div = fn1 / mul;
            */
          //   System.out.println(binomialCoeff(l, k));
        }
	}
}
