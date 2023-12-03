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

public class DuplicateLinkedList {
    class ListNode {
        ListNode next;
        int data;
    }
    public static void main(String args[]) {
        
    }
    
    void remove(ListNode head) {
        ListNode temp = head;
        ListNode next = head.next;
        
        while(next != null) {
            if(temp.data == next.data) {
                temp.next = next.next;
                next = temp.next;
            }
            else {
                temp = next;
                next = next.next;   
            }
        }
    }
}
