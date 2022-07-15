
package CodeChef;

import java.util.Scanner;


public class TEMPLELA {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            if(n%2 == 0){     // n is even
                System.out.println(" in if");
                System.out.println("no");
                continue;
            }
            System.out.println("\n in else");
            int ar[] = new int[n];
            
            for(int i = 0 ; i < n ; i++)
                ar[i] = sc.nextInt();
            
            if(ar[0] != 1 || ar[n-1] != 1){  // start and end by 1
                System.out.println("no");
                continue;
            }
            
            int i = 0 , j = n-1;
            for(i = 0, j = n-1; i < n ; i++, j--){
                if(i == j)
                    break;
                if(ar[i] != ar[j])
                    break;
                if(Math.abs(ar[i+1] - ar[i]) > 1)
                    break;
                if(Math.abs(ar[j-1] - ar[j]) > 1)
                    break;
            }
            
            if(i == j)
                System.out.println("yes");
            else
                System.out.println("no");
            
        }    
    }
}
