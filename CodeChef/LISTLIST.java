/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author Vinay Chopda
 */
public class LISTLIST {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
	    FileWriter fw=new FileWriter("C:\\Users\\Vinay Chopda\\Desktop\\output.txt");
		while(t-- > 0){
		    int n = sc.nextInt();
		    fw.write(n);
		    if(n == 1){
		        sc.nextInt();
		        System.out.println("0");
		        continue;
		    }
		    int ar[] = new int[n];
		    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		    int max_freq = 1;
		    for(int i = 0 ; i < n ; i++){
		        ar[i] = sc.nextInt();
		        if(!hm.containsKey(ar[i]))
		            hm.put(ar[i], 1);
		        else{
		            int freq = hm.get(ar[i]);
		            max_freq = Math.max(max_freq, (freq+1));
		            hm.put(ar[i], freq+1);
		        }
		    }
		    if(max_freq == 1)
		        System.out.println(-1);
		    else
		    {
		        int rem = max_freq / 2;
                System.out.println(n-rem);
		    }
		}
		fw.close();
	}
}
