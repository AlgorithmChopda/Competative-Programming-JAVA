/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;

import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class proxy_2023 {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0) {
		    int n = sc.nextInt();
		    int s[] = new int[n];
		    for(int i = 0 ; i < n ; i++) {
		        s[i] = sc.nextInt();
		    }
		    int l[] = new int[n];
		    for(int i = 0 ; i < n ; i++) {
		        l[i] = sc.nextInt();
		    }
		    
		    int cnt = 0;
                    int ans = 0;
                    for(int i = 0 ; i < n ; i++) {
                        if(s[i] == 1) {
                            cnt++;
                            ans++;
                        }
                        else{
                            if(l[i] == 0){
                                // absent and not looked
                                if(cnt > 0) {
                                    ans++;
                                    cnt--;
                                }
                            } 
                        }
                    }
                    
                    System.out.println(ans);
		} 
	}
}
