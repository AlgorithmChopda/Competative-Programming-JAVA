/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeforces;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class _827_D {
    static class Solution {
        int GCD(int a, int b)
        {
            if (b == 0)
                return a;
            return GCD(b, a % b);
        }
        
        public void solve(Scanner sc){
            int n = sc.nextInt();
            int ar[] = new int[n];
            
            int max = -1;
            int prime_index = -1;
            HashMap<Integer, Integer> prime = new HashMap<>();
            for(int i = 0 ; i < n ; i++){
                ar[i] = sc.nextInt();
                if(ar[i] == 1){
                    max = i + i + 2;
                    prime_index = i;
                    continue;
                }
                boolean flag = true;
                int j = -1;
                 for (j = 2; j <= ar[i] / 2; j++) {
                    if (ar[i] % j == 0) {
                        flag = false;
                        break;
                    }
                }
                 
                if(flag){
                    prime_index = i;
                    prime.put(ar[i], j);
                }
            }
            
            if(prime_index == -1){
                System.out.println("-1");
                return;
            }
            
            if(ar[prime_index] == 1){
                System.out.println(prime_index + (n-1) + 2);
                return;
            }
            
            for(int i = n-1 ; i >= 0 ; i--){
                if(i != prime_index && ar[i] != ar[prime_index] && ar[i] % ar[prime_index] != 0){
                    System.out.println(Math.max(max,i+prime_index + 2));
                    return;
                }
            }
            
            System.out.println("-1");
            /*int ans = -1;
            for(int i = n-1 ; i >= 0 ; i--){
                for(int j = i ; j >= 0 ; j--){
                    if(i+j <= ans - 2)
                        break;
                    if(ar[i] % 2 == 0 && ar[j] % 2 == 0)
                        continue;
                    if(ar[i] % 3 == 0 && ar[j] % 3 == 0)
                        continue;
                    if(GCD(ar[i], ar[j]) == 1)
                        ans = Math.max(i+j+2, ans);
                }
            }        

            System.out.println(ans);
            */
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
