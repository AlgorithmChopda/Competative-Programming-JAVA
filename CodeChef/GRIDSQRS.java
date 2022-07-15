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
public class GRIDSQRS {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int mat[][] = new int[n][n];
            int cnt = 0;
            
            for(int i = 0 ; i < n ; i++){
                String str = sc.next();
                for(int j = 0 ; j < n ; j++){
                    mat[i][j] = Integer.parseInt(str.charAt(j)+"");
                    if(mat[i][j] == 1)
                        cnt++;
                }
            }
        
            if(n == 1){
                System.out.println(cnt);
                continue;
            }
            int row[][] = new int[n+2][n+2];
            int col[][] = new int[n+2][n+2];
        
            for(int i = 0 ; i <= n ; i++){
                row[i][0] = 0;
                row[0][i] = 0;
                col[0][i] = 0;
                col[i][0] = 0;
            }   
            
            for(int i = 1 ; i <= n ; i++){
                for(int j = 1 ; j <= n ; j++){
                    if(mat[i-1][j-1] == 0){
                        row[i][j] = 0;
                        col[i][j] = 0;
                    }
                    else{
                        row[i][j] = row[i][j-1]+1;
                        col[i][j] = col[i-1][j]+1;
                    }
                }
            }
            
            for(int i = 1 ; i <= n ; i++){
                for(int j = 1 ; j <= n ; j++){
                    for(int k = 2; k <= i && k <= j; k++){
                        // top row
                        int a = row[i-k+1][j] - row[i-k+1][j-k];
                        if(a != k)
                            continue;
                        
                        // bottom row
                        int b = row[i][j] - row[i][j-k];
                        if(b != k)
                            continue;
                        
                        // right column
                        int c = col[i][j] - col[i-k][j];
                        if(c != k)
                            continue;
                        
                        //left column
                        int d = col[i][j-k+1] - col[i-k][j-k+1];
                        if(d != k)
                            continue;
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
            
        } 
    }
}
