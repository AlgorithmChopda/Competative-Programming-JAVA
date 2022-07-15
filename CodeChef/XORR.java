/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class XORR {
    	public static void main (String[] args) 
	{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            
            while(t-- > 0)
            {
                    int n = sc.nextInt();
                    int ar[] = new int[n];
                    int br[] = new int[n];

                    for(int i = 0 ; i < n ; i++)
                        ar[i] = sc.nextInt();
                    for(int i = 0 ; i < n ; i++)
                        br[i] = sc.nextInt();

                    HashMap<Integer, Integer> hs = new HashMap<>();
                    int count = 0;

                    for(int i = 0 ; i < n ; i++)
                    {
                        int xor = (ar[i] ^ br[i]);
                        if(hs.containsKey(xor)){
                            count += hs.get(xor);
                            hs.put(xor, hs.get(xor) + 1);
                        }
                        else
                            hs.put(xor, 1);
                    }
                    System.out.println(count);
            }
	}
}
