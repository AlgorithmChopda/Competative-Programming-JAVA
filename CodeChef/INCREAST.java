/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;
import java.util.Scanner;
/**
 *
 * @author Vinay Chopda
 */
public class INCREAST {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            StringBuilder str = new StringBuilder(sc.next());
            StringBuilder temp = new StringBuilder(str);
            if(str.length() == 1){
                System.out.println(str);
                continue;
            }
            
            char min = str.charAt(str.length() - 1);
            char last = '#';
            str.setCharAt(str.length() - 1, '$');
            for(int i = str.length()-2 ; i >= 0 ; i--){
                if(min >= str.charAt(i)){
                    min = str.charAt(i);
                    str.setCharAt(i, '$');
                }
                else
                    last = str.charAt(i);
            }
            if(last == '#') // every char is picked up
                System.out.println(temp);
            else
            {
                boolean flag = true;
                String end = "";
                String op = "";
                for(int i = 0 ; i < str.length(); i++){
                    if(str.charAt(i) == '$' && flag == true){
                        if(last > temp.charAt(i))
                            op = op + temp.charAt(i);
                        else{
                            if(last == temp.charAt(i))
                            {
                                int j = 0;
                                while(j < end.length() && end.charAt(j) == temp.charAt(i)){
                                    j++;
                                }
                                if(j < end.length() && end.charAt(j) < temp.charAt(i)){
                                        end = end + temp.charAt(i);
                                        flag = false;
                                }
                                else{
                                    op = op + temp.charAt(i);
                                    int ind = i;
                                    i++;
                                    while(i < str.length()){
                                        if(temp.charAt(ind) != temp.charAt(i))
                                            end = end + temp.charAt(i);
                                        else
                                            op = op + temp.charAt(i);
                                        i++;
                                    }
                                    i--;
                                    flag = false;
                                }
                            }
                            else{
                                end = end + temp.charAt(i);
                                flag = false;
                            }
                            //flag = false;
                        }
                    }
                    else
                        end = end + temp.charAt(i);
                }
                System.out.println(op+end);
            }
        }
    }
}
