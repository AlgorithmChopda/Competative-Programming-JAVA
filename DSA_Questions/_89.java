/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.Scanner;

/**
 *
 * @author Vinay Jain
 */

class InvalidMarks extends Exception {
    public InvalidMarks(){
        super("Marks must be in the range of 0 to 100");
    }
}
public class _89 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("\n Enter the Marks ");
            int marks = sc.nextInt();
            
            System.out.println("\n Entered Marks : "+marks);
            if(marks < 0 || marks > 100)
                throw new InvalidMarks();
            System.out.println("\n valid Marks");
        }
        catch(InvalidMarks e){
            System.out.println("\nException : \n"+e);
        }
            
    }
}
