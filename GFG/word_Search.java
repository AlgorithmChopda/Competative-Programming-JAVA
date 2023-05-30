/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GFG;

/**
 *
 * @author Vinay Jain
 */
public class word_Search {
    int r, c;
    boolean v[][];
    boolean dfs(char mat[][], String w, int index, int i, int j) {
        if(index == w.length()) return true;
        
        if(i < r && i >= 0 && j < c && j >= 0) {
            if(v[i][j]) return false;
            if(w.charAt(index) != mat[i][j])    return false;
            v[i][j] = true;
        
            if(dfs(mat, w, index + 1, i+1, j)) return true;
            if(dfs(mat, w, index + 1, i-1, j)) return true;
            if(dfs(mat, w, index + 1, i, j+1)) return true;
            if(dfs(mat, w, index + 1, i, j-1)) return true;
            
            v[i][j] = false;
        }
        
        return false;
    }
    
    public boolean isWordExist(char[][] mat, String w)
    {
        r = mat.length;
        c = mat[0].length;
        v = new boolean[r][c];
        
        for(int i = 0 ; i < r ; i++) {
            for(int j = 0 ; j < c ; j++) {
                if(dfs(mat, w, 0, i, j))    return true;
            }
        }
        
        
        return false;
    }
}
