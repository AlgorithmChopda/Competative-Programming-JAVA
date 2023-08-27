
import java.util.PriorityQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinay Jain
 */
public class String_Mathematics {
    void function(String s) {
        boolean inLeft = true;
        
        char ch[] = s.toCharArray();
        for(char c : ch) {
            if(c == '=') {
                inLeft = false;
                break;
            }
            
            if(c == 'x') {
                break;
            }
        }
        
        if(inLeft) {
            // x lies in left
            String temp[] = s.split(" ");
            int i = 0;
            for(String ele : temp) {
                boolean flag = false;
                for(char c : ele.toCharArray()) {
                    if(c == 'x') {
                        flag = true;
                        break;
                    }
                }
                if(flag)    break;
                i++;
            }
            
            
        }
        else {
            // x lies in right
            String temp[] = s.split(" ");
            int result = eval(Integer.parseInt(temp[0]), Integer.parseInt(temp[2]), temp[1].toCharArray()[0]);
        }
    }
    
    int eval(int a, int b, char op) {
        System.out.println(a + " " + b + " " + op);
        switch(op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
        }
        
        return 0;
    }
    
    public static void main(String args[]) {
        String s[] = new String[10];
        
        PriorityQueue<int []> q = new PriorityQueue<>((a, b) -> {
            if(a[0] == b[0]) return b[1] - a[1];
            return b[0] - a[0];
        });
        
        for(int i = 0 ; i < s.length ; i++) {
            q.add(new int[] {s[i].length(), i});
        }
        
        q.remove(); q.remove();
        String ans = s[q.remove()[1]];
    }    
}
