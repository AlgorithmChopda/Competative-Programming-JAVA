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

class A {
    int x = 100;
    void message() {
        System.out.println("Base Class");
    }
}

class B extends A {
    int x = 200;
    void message() {
        System.out.println("Child Class");
    }
}

public class Overloading {
    public static void main(String args[]) {
        A temp = new B();
        System.out.println(temp.x);
        temp.message();
    }
}
