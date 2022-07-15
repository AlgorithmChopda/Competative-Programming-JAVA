
package CodeChef;
import java.util.Scanner;
public class VANDH {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int hill = sc.nextInt();
            int valley = sc.nextInt();
            String pat = "", pat1 = "";
            String op = "";
            if(hill == valley){
                for(int i = 0; i <= hill ; i++)
                    op += "01";
            }
            else
            {
                int min = 0;
                if(hill < valley){
                    pat = "10";
                    pat1 = "110";
                    min = hill;
                }
                else{
                    pat = "01";
                    pat1 = "001";
                    min = valley;
                }
                for(int i = 0 ; i <= min ; i++)
                    op += pat;
                int a = Math.max(hill, valley);
                for(int i = 0 ; i < a-min-1; i++)
                    op += pat1;
                if(hill < valley)
                    op += "1";
                else 
                    op += "0";
            }
            System.out.println(op);
        }
    }
}
