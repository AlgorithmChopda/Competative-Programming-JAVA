/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class largest_Y {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            
            int ar[] = new int[n];
            for(int i = 0 ; i < n ; i++) {
                ar[i] = sc.nextInt();
            }
                    
            int s = 0, e = x;
            int ans = e;
            while(s <= e) {
                int mid = s + (e - s) / 2;
                System.out.println("mid : "+mid);
                HashSet<Integer> set = new HashSet<>();
                boolean flag = false;
                for(int i = 0 ; i < n ; i++) {
                    set.add(ar[i] | mid);
                    if(set.size() == 2){
                        flag = true;
                        break;
                    }
                }
                if(flag) {
                    ans = mid;
                    s = mid + 1;
                }
                else{
                    //e = mid - 1;
                    s++;
                }
            }
            
            System.out.println(ans);
        }
    }
}
