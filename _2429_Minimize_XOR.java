
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinay Jain
 */
public class _2429_Minimize_XOR {
    static class Solution {
        public void solve(Scanner sc){
            System.out.println("\n "+minimizeXor(25, 72));
        }
        
        public int minimizeXor(int num1, int num2) {
            int bn1[] = new int[32];
            int set_1 = 0, set_2 = 0;
            
            for(int i = 31 ; i >= 0 ; i--){      
                int a = num1 >> i;
                int b = num2 >> i;
                
                if((a&1) > 0){
                    set_1++;
                    bn1[31-i] = 1;
                }
                if((b&1) > 0)
                    set_2++;
            }
            
            for(Integer i : bn1)
                System.out.print(i+" ");
            System.out.println("\n set1 : "+set_1);
            System.out.println("\n set2 : "+set_2);
            
            if(set_2 == set_1)
                return num1;
            
            int ans = num1;
            if(set_2 > set_1){
                int find_bits = set_2 - set_1;
                int val = 1;
                for(int i = 31 ; i >= 0 && find_bits > 0; i--){
                    if(bn1[i] == 0){
                        find_bits--;
                        ans += val; 
                    }
                    val *= 2;
                }   
            }
            else{
                for(int i = 0 ; i <= 31 && set_2 > 0; i++){
                    if(bn1[i] == 1){
                        ans -= Math.pow(2, 31-i);
                        set_2--;
                    }
                }
                ans = num1 - ans;
            }
            
            return ans;
        }   
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
            new Solution().solve(sc);
    }
}
