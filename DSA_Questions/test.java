/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Vinay Chopda
 */
public class test {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a[] = br.readLine().split(" ");
        String b[] = br.readLine().split(" ");
        String c[] = br.readLine().split(" ");
        
        PrintWriter writer = new PrintWriter(System.out);    
      writer.write("Javatpoint provides tutorials of all technology.");   
      writer.flush();  
      writer.close();
    }
}
