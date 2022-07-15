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
public class CHEFFAV {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    String str = sc.next();
		    
		    int code_ind = 0, chef_ind = 0;  // code = ind   // chef = ind1;
                    boolean flag = true;
		    while(true)
                    {
                        chef_ind = str.indexOf("chef", chef_ind);
                        if(chef_ind == -1)
                            break;
                        code_ind = str.lastIndexOf("code", chef_ind);
                        
                        if(code_ind == -1){
                            flag = false;
                            break;
                        }
                        chef_ind++;    
                    }      
                    
                    if(flag)
                        System.out.println("AC");
                    else
                        System.out.println("WA");
		}
    }
}
