/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.util.Scanner;

public class even_length {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s[] = str.split(" "), op = "";
        int max_length = -1;
        for(String temp : s){
            if(temp.length() % 2 == 0){
                if(max_length < temp.length()){
                    op = temp;
                    max_length = temp.length();
                }
            }
        }
        System.out.println(op);
    }
}
