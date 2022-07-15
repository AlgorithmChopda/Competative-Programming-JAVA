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
 * @author Vinay Chopda
 */
public class S07E09 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

            int n = sc.nextInt();
            long min = 10000;

            for (int i = 0; i < n; i++) {

                int temp = sc.nextInt();

                if (temp <= 0) {
                    if (hm.containsKey(0)) 
                        hm.put(0, (hm.get(0) + 1));
                    else 
                        hm.put(0, 1);
                    min = 0;
                } 
                else {
                    if (temp < min) {
                        hm.put(temp, 1);
                        min = temp;
                    } 
                    else{ 
                        if (temp == min) 
                            hm.put(temp, (hm.get(temp) + 1));   
                    }
                }
            }

            int result = (int) ((n * min) + (n - hm.get(min)));
            
            System.out.println(result);
        }
    }
}
