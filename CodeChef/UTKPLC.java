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
 * @author Vinay Chopda
 */
public class UTKPLC {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
		while(t-- > 0)
                {
		    HashSet<Character> hm = new HashSet<Character>();
                    char ar[] = new char[3];
                    for(int i = 0 ; i <= 2 ; i++)
                        ar[i] = sc.next().charAt(0);
                    
                    hm.add(sc.next().charAt(0));
                    hm.add(sc.next().charAt(0));
                    
                    for(int i = 0 ; i <= 2 ; i++){
                        if(hm.contains(ar[i])){
                            System.out.println(ar[i]);
                            break;
                        }
                    }
                                
		}
	}
}
