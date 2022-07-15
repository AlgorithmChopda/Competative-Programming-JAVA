
package CodeChef;

import java.util.HashSet;
import java.util.Scanner;

public class NewClass {
    public static void main(String args[]){
        
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while(n > 0)
        {
            HashSet<Integer> hs = new HashSet<>();
            int t = sc.nextInt();
            int temp = t;
            
            if(t < 12){
                System.out.println("no\n");
                n--;
                continue;
            }
            int unique_elements = 0;
            
            while(t > 0)
            {
                int ele = sc.nextInt();
                if(!hs.contains(ele)){
                    unique_elements++;
                     hs.add(ele);
                }
                t--;
            }
            System.out.println("ele = "+unique_elements);
            
            if(unique_elements > 12)
                System.out.println("no\n");
            else
                System.out.println("yes\n");
        
            n--;
        }
        
    }
}
