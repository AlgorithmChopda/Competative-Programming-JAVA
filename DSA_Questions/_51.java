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

class Menu_51 {
    Vector<String> ar = new Vector<>();
    
    public void Add(String name, int index){
        ar.add(index, name);
    }
    
    public void Delete(String name){
        ar.remove(name);
    }
    
    public void Display(){
        System.out.println("\n Vector : ");
        for(String name : ar)
            System.out.println(name);
        System.out.println("\n");
    }
}

public class _51 {
    public static void main(String args[]){
        Menu_51 m = new Menu_51();
        Scanner sc = new Scanner(System.in);
        int ch = -1;
        
        System.out.println("\n No of Initial Elements in list : ");
        int n = sc.nextInt();
        
        for(int i = 0 ; i < n ; i++){
            System.out.println(" Name : ");
            String name = sc.next();
            m.Add(name, i);
        }
        
        
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
                            System.out.println(" Enter the Location : ");
                            int index = sc.nextInt();
                            m.Add(name, index-1);
                            break;
                case 2 :
                            System.out.println("\n Enter the Name to Delete : ");
                            name = sc.next();
                            m.Delete(name);
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
