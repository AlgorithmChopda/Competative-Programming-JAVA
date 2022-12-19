/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author Vinay Jain
 */
public class _6259 {
    class Allocator {

        int ar[];
        int left = 0;
        int n;
        public Allocator(int n) {
            this.n = n;
            ar = new int[n];
        }

        public int allocate(int size, int id) {
            int cnt = 0;
            int i = 0;
            for(i = 0 ; i < n ; i++){
                if(ar[i] == 0)  cnt++;
                else    cnt = 0;
                if(cnt >= size) break;
            }
            print();
            if(i == n)  return -1;
            for(int j = i - size + 1 ; j <= i ; j++)
                ar[j] = id;
            return i-size+1;
        }

        void print(){
            for(int i : ar)
                System.out.print(i+" ");
            System.out.println("\n");
        }
        
        public int free(int id) {
            int cnt = 0;
            for(int i = 0 ; i < n ; i++){
                if(ar[i] == id){
                    ar[i] = 0;
                    cnt++;
                }
            }
            print();
            return cnt;
        }
    }
}
