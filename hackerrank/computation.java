
package hackerrank;

public class computation {
    public static void main(String args[]){
        long k = 6;
        long ele = 10;
        for(int i = 2 ; i <= k ; i++){
            ele *= ele;
            System.out.println("\n "+ele);
        }
    }
}
