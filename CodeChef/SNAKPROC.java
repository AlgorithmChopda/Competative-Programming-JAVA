
package CodeChef;

import java.util.Scanner;

public class SNAKPROC {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            sc.nextInt();
            String str = sc.next();
            char req = 'H';
            int i = 0;
            for(i = 0 ;  i < str.length() ; i++){
                if(str.charAt(i) != '.'){
                    if(req == str.charAt(i)){
                        if(req == 'H')
                            req = 'T';
                        else
                            req = 'H';
                    }
                    else
                        break;
                }
            }
             
            if(i == str.length() && req != 'T')
                System.out.println("Valid");
            else
                System.out.println("Invalid");
        }
    }
}
