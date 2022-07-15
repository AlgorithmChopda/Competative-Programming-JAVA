
package hackerrank;

import java.util.ArrayList;

public class Matrix_Spiral_Print {
    
    private int mat[][] , r , c;
    
    public Matrix_Spiral_Print(){ }
    public Matrix_Spiral_Print(int mat[][] , int r , int c){
        this.mat = mat;
        this.r = r ;   this.c = c ;
        this.print_Spiral();
    }
    
    private void print_Spiral(){
        ArrayList<Integer> ar = new ArrayList<Integer>();
        int cnt = 0 , i = 0 , j = 0;
        boolean sel[][] = new boolean[r][c];
        
        
        for(int a = 0 ; a < r ; a++)
            for(int b = 0 ; b < c ; b++)
                sel[a][b] = false;
        
        
        while(cnt < r*c){
            while(j < c && sel[i][j] == false){
                sel[i][j] = true;
                ar.add(mat[i][j]);
                j++; cnt++;
            }
            j--; i++;
            
            while( i < r && sel[i][j] == false){
                sel[i][j] = true;
                ar.add(mat[i][j]);
                i++; cnt++;
            }
            i--; j--;
            
            while(j >= 0 && sel[i][j] == false){
                sel[i][j] = true;
                ar.add(mat[i][j]);
                j--; cnt++;
            }
            i--; j++;
            
            while(i >= 0 && sel[i][j] == false){
                sel[i][j] = true;
                ar.add(mat[i][j]);
                i--; cnt++;
            }
            i++; j++;
        }
        
        for(int a = 0 ; a < ar.size() ; a++){
            System.out.println(ar.get(a)+" ");
        }
        
    }
}




class Driver{
    public static void main(String args[]){
        int mat[][] = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
        new Matrix_Spiral_Print(mat , 4, 4);
        System.out.println("\n in driver ");
    }
}
