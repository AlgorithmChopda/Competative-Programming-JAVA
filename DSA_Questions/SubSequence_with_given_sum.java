package DSA_Questions;

public class SubSequence_with_given_sum 
{
    
    public static void main(String args[])
    {
        SubSequence_with_given_sum s = new SubSequence_with_given_sum(); 
        int ar[] = new int[5];
        ar[1] = 2 ; ar[2] = 3 ; ar[3] = 5; ar[4] = 6;
        s.given_Sum(ar, 15);
    }
    
    public void given_Sum(int ar[], int sum)
    {
        boolean dp[][] = new boolean[ar.length+1][sum+1];
        
        for(int i = 0 ; i <= sum ; i++)
            dp[0][i] = false;
        for(int i = 0 ; i < ar.length ; i++)
            dp[i][0] = true;
        
        for(int i = 1 ; i < ar.length ; i++){
            for(int j = 1 ; j <= sum ; j++){
              if(ar[i] <= j){ // including the current element;
                    dp[i][j] = dp[i-1][j-ar[i]];
              }
              if(!dp[i][j]){
                dp[i][j] = (dp[i][j] == true) ? true : dp[i-1][j];
              }
            }
        }
        
        /*System.out.print("\t  ");
        
        for(int i = 0 ; i <= sum ; i++)
            System.out.print(i+ "     ");
        
        System.out.println("\n ");
        for(int i = 0 ; i < ar.length ; i++){
            
            for(int j = 0 ; j < i ; j++){
                System.out.print(ar[j]+",");
            }
            System.out.print("\t");
            for(int j = 0 ; j <= sum ; j++)
                System.out.print(" "+dp[i][j]);
            System.out.println("\n ");
        }
                */
        
        if(dp[ar.length-1][sum])
            System.out.println("\n sum is possible");
        else
            System.out.println("\n not possible");
        
        //return dp[ar.length][sum];
    }
    
}
