
package CodeChef;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class QUALPREL {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            Integer ar[] = new Integer[n];
            
            for(int i = 0 ; i < n ; i++)
                ar[i] = sc.nextInt();
            
            Arrays.sort(ar, Collections.reverseOrder());
            
            int count = k;
            System.out.println(count);
            for(int i = k; i < n ; i++){
                System.out.println(ar[i]);
                if(ar[i] >= ar[k-1])
                    count++;
                else
                    break;
           }
           System.out.println(count); 
        }
        
    }   
}
