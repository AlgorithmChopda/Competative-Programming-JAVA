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
public class powersum {
    
    /*	static boolean is_Powerof2(int ele)
    {
        for(int i = 2 ; i <= 1048576; i *= 2)
        {
            if(i == ele)
                return true;
        }
        return false;
    }
    */
    public static void main(String args[]) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int ele = sc.nextInt();
            int min = ele, max = ele, ind = 0, sum = ele;
            for(int i = 1 ; i < n ; i++)
            {
                ele = sc.nextInt();
                if(ele > max)
                    max = ele;
                else{
                    if(ele < min){
                        min = ele;
                        ind = i;
                    }
                }
                sum += ele;
            }
            
            if(sum == 1)
                System.out.println("0");
            else
            {
                int diff = next_Powerof2(sum);
                if(diff == 0)
                {
                    System.out.println("0");
                    continue;
                }
                else
                {
                    int x = (diff / min) + 1;
                    System.out.println("1\n1 "+x+"\n"+ind);
                }
            } 
        }
    }

    private static int next_Powerof2(int sum){ 
        int next_power = (int) Math.ceil(Math.log(sum) / Math.log(2));
        return (int) (Math.pow(2, next_power) - sum);
    }
}