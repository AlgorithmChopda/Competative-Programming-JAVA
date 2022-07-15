package CodeChef;

import java.util.Scanner;

public class CHECKMATE {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a1 = sc.nextInt();  // king col
            int a2 = sc.nextInt();  // king row
            int b1 = sc.nextInt();  // rook1 col
            int b2 = sc.nextInt();  // rook1 row
            int c1 = sc.nextInt();  // rook2 col
            int c2 = sc.nextInt();  // rook2 row

            
            //System.out.println("\n input");
            if ((a1 != 1 && a2 != 1) && (a1 != 8 && a2 != 8)) // not at boundary
                System.out.println("NO");
            else
            {
                if(a1 == 1 && b2 != c2){ // on left column
                    if(b1 == 2 || c1 == 2){ // in just next column to it
                       if(b2+1 != a2 && b2 - 1 != a2 && c2 + 1 != a2 && c2 - 1 != a2){
                                    System.out.println("YES");
                                    continue;
                        } 
                    }
                }
                if(a1 == 8 && b2 != c2){ // on right column
                    if(b1 == 7 || c1 == 7){
                        if(b2+1 != a2 && b2 - 1 != a2 && c2 + 1 != a2 && c2 - 1 != a2){
                                    System.out.println("YES");
                                    continue;
                        }
                    }
                }
                
                if(a2 == 1 && b1 != c1){ // on bottom row
                    if(b2 == 2 || c2 == 2){
                        if(b1+1 != a1 && b1 - 1 != a1 && c1 + 1 != a1 && c1 - 1 != a1){
                            System.out.println("YES");
                            continue;
                        }
                    }
                }    
                    
                
                if(a2 == 8 && b1 != c1){ // on bottom row
                    if(b2 == 7 || c2 == 7){ // in just next column to it
                        if(b1+1 != a1 && b1 - 1 != a1 && c1 + 1 != a1 && c1 - 1 != a1){
                            System.out.println("YES");
                            continue;
                        }
                    }
                }
                
                System.out.println("NO");
        
            }   
        }
    }

}

