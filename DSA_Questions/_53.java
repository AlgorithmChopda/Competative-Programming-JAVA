/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Vinay Jain
 */

class Menu_53 {
    Vector<String> ar = new Vector<>();
    
    public boolean Add(String name){
        for(String s : ar){
            if(s.equals(name))  return false;
        }
        ar.add(name);
        return true;
    }
    
    public boolean Delete(String name){
        return ar.remove(name);
    }
    
    public void Display(){
        System.out.println("\n Vector : ");
        for(String name : ar)
            System.out.println(name);
        System.out.println("\n");
    }
}

public class _53 {
    public static void main(String args[]){
        Menu_53 m = new Menu_53();
        Scanner sc = new Scanner(System.in);
        int ch = -1;
        
        do{
            System.out.println(" 1 : Add");
            System.out.println(" 2 : Delete");
            System.out.println(" 3 : Display");
            System.out.println(" 4 : Exit");
            
            System.out.println("\n Enter your choice : ");
            ch = sc.nextInt();
            String name;
            switch(ch){
                case 1 : 
                            System.out.println("\n Enter the Name to Add : ");
                            name = sc.next();
                            if(!m.Add(name))
                                System.out.println("\n Name already exists");
                            else
                                System.out.println("\n Name added \n");
                            break;
                case 2 :
                            System.out.println("\n Enter the Name to Delete : ");
                            name = sc.next();
                            if(!m.Delete(name))
                                System.out.println("\n No such name found \n");
                            else
                                System.out.println("\n Name deleted");
                            break;
                case 3 :
                            m.Display();
                            break;
                case 4 :    
                            System.out.println("\n Thank U");
                            break;
                default :
                            System.out.println("Wrong case ");
            }
            
        }while(ch != 4);
    }
}
