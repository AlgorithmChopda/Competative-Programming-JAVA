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

class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    
    Node add(Node root, int val){
        if(this.data == -1){    // if root is null
            this.data = val;
            return this;
        }

        root.next = new Node(val);
        return root.next;
    }
    
    void display(){
       Node temp = this;
       System.out.print("\n Linked List : ");
       while(temp != null){
           System.out.print(temp.data+" ");
           temp = temp.next;
       }
    }
}

public class LinkedList {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Node root = new Node(-1), prev = null;
        char ch = 'a';
        
        do{
            System.out.print("\n Enter the data : ");
            int val = sc.nextInt();
            prev = root.add(prev, val);
            
            System.out.print("\n want another Node (y/n) : ");
            ch = sc.next().charAt(0);
        }while(ch != 'n');
        
        root.display();
        System.out.println("\n");
    }
}
