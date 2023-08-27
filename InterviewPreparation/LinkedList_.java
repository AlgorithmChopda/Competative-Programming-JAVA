/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewPreparation;

/**
 *
 * @author Vinay Jain
 */

class Node {
    int val;
    Node next;
    
    Node(int val) {
        this.val = val;
        next = null;
    }
}

class LinkedList {
    Node head;
    LinkedList() {
        head = null;
    }
    void addAtEnd(int val) {
        if(head == null) {
            head = new Node(val);
        }
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            
            temp.next = new Node(val);
        }
    }
    
    void addAtStart(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }
    
    void addInBetween(int val, int index) {
        Node temp = head, prev = null;
        for(int i = 0 ; i < index - 1 ; i++) {
            if(temp == null) {
                System.out.println("no such index found");
                return;
            }
            prev = temp;
            temp = temp.next;
        }
        
        Node node = new Node(val);
        if(prev == null) {
            node.next = head;
            head = node;
        }
        else {
            prev.next = node;
            node.next = temp;
        }
    }
    void display() {
        Node temp = head;
        System.out.println();
        int i = 0;
        while(temp != null && i < 6) {
            System.out.print(temp.val+ " ");
            temp = temp.next;
            i++;
        }
    }
    
    Node reverseK(int size) {
        Node cur = head;
        int k = 0;
        Node prev = null, next = null, start = head;
        Node modifiedHead = null, prevHead = null;
        Node startingNode = null, prevStartingNode = null;
        
        boolean isStartingList = true;
        while(true) {
            if(k == size) {                
                if(modifiedHead == null) {
                    // starting list
                    modifiedHead = prev;
                }
                else {
                    prevStartingNode.next = prev;
//                    startingNode.next = prev;
                }
                
//                cur = prev.next;
                prev = next = null;                
                k = 0;
                
                if(cur == null)     break;
                
                continue;
            }
            if(k < size && cur != null) {
                if(k == 0) {
                    prevStartingNode = startingNode;
                    startingNode = cur;
                }
                
                next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;
                
                k++;
            }
        }
        
        return modifiedHead;
    }
    
    void reverse() {
        Node prev = null;
        Node next = null;
        
        while(head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        
        head = prev;
    }
}

public class LinkedList_ {
    public static void main(String args[]) {
        LinkedList head = new LinkedList();
        head.addAtEnd(10);
        head.addAtEnd(20);
        head.addAtEnd(30);
        head.addAtEnd(40);
        
        head.display();
        head.reverseK(2);
        head.display();
    }
}
