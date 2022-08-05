/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;

import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */
public class start_50_4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            long x = sc.nextLong();
            long y = sc.nextLong();
            
            /*if(x == y){
                if(x <= 3)
                    System.out.println("-1");
                else{
                    if(x % 2 == 0)
                        System.out.println(x/2 + " " + x/2);
                    else
                        System.out.println(x/2 + " " + ((x/2)+1) );
                    System.out.println("1 "+x);
                }         
                continue;
            }
            
            if(x == 1){
                if( y <= 3)
                    System.out.println("-1");
                else{
                    if(y % 2 == 0){
                        System.out.println("0 1");
                        System.out.println("2 "+y/2);
                    }
                    else{
                        boolean op = false;
                        for(int i = 3 ; i <= (y / 2) ; i += 2){
                            if( y % i == 0){
                                op = true;
                                System.out.println("0 1");
                                System.out.println(Math.min(i, (y/i) ) + " " + Math.max(i, (y / i)) );
                            }
                        }
                        
                        if(!op)
                            System.out.println("-1");
                    }
                }
                continue;                 
            }
            
            if(y == 1){
                if( x <= 1)
                    System.out.println("-1");
                else{
                    System.out.println("0 "+x);
                    System.out.println("1 1");        
                }    
                continue;
            }
            
            // if x and y both are not equal and greater than 1 then : 
            
            System.out.println("0 "+x);
            System.out.println("1 "+y);
                    */
            
            if(x == 1 && y != 1){
                if( y <= 3)
                    System.out.println("-1);");
                else{
                    if(y % 2 == 0){
                        System.out.println("0 1");
                        System.out.println("2 "+(y / 2));
                    }
                    else{
                        boolean op = false;
                        for(int i = 3 ; i <= (y / 2) ; i += 2){
                            if( y % i == 0){
                                op = true;
                                System.out.println("0 1");
                                System.out.println(Math.min(i, (y/i) ) + " " + Math.max(i, (y / i)) );
                            }
                        }
                        
                        if(!op)
                            System.out.println("-1");
                    }           
                }
                continue;
            }
            
            if(y == 1 && x != 1){
                if(x <= 3)
                    System.out.println("-1");
                else{
                    System.out.println("2 "+(x-2));
                    System.out.println("1 1");
                }
            }
            
            if(x == y){
                long diff = Long.MAX_VALUE;
                for (int i=1; i<=Math.sqrt(y); i++){
                    if (y%i==0)
                    {
                        if (y/i == i){
                            
                        }
                        else // Otherwise print both
                            System.out.print(i+" " + y/i + " " );
                    }
                }
            }
            
            
        }
            
            
        
    }
}
