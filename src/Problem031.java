/**
 * Created by sreedish.ps on 21/09/14.
 */
public class Problem031 {
    public static void main(String[] args) {
        int arr[] = {1,2,5,10,20,50,100,200};

        long startTime = System.nanoTime();
        System.out.println(countBruteForce(arr, 8, 200));
        System.out.println("Time taken (in ms)= "+
                (System.nanoTime() - startTime) / 1E6);


        startTime = System.nanoTime();
        System.out.println(countOptimal(arr, 8, 200));
        System.out.println("Time taken (in ms)= "+
                (System.nanoTime() - startTime) / 1E6);

        startTime = System.nanoTime();
        System.out.println(countDP(arr, 8, 200));
        System.out.println("Time taken (in ms)= "+
                (System.nanoTime() - startTime) / 1E6);


    }



    private static int countBruteForce(int[] S,int m,int n) {
        if(n == 0){
            return 1;
        }
        if( n < 0){
            return 0;
        }
        if(m <= 0){
            return 0;
        }

        return countBruteForce( S, m - 1, n ) + countBruteForce( S, m, n-S[m-1] );
    }

    private static int countDP( int S[], int m, int n )
    {
        int i, j, x, y;

        // We need n+1 rows as the table is consturcted in bottom up manner using
        // the base case 0 value case (n = 0)
        int table[][] = new int[n+1][m];



        // Fill rest of the table enteries in bottom up manner
        for (i = 0; i < n+1; i++)
        {
            for (j = 0; j < m; j++)
            {
                if(i == 0){
                    table[i][j] = 1;
                    continue;
                }

                // Count of solutions including S[j]
                x = (i-S[j] >= 0)? table[i - S[j]][j]: 0;

                // Count of solutions excluding S[j]
                y = (j >= 1)? table[i][j-1]: 0;

                // total count
                table[i][j] = x + y;
            }
        }
        return table[n][m-1];

    }

    private static int countOptimal( int S[], int m, int n )
    {
        // table[i] will be storing the number of solutions for
        // value i. We need n+1 rows as the table is consturcted
        // in bottom up manner using the base case (n = 0)
        int[] table = new int[n+1];

        // Initialize all table values as 0
        for(int i =0;i<=n;i++){
            table[i] =0;
        }

        // Base case (If given value is 0)
        table[0] = 1;

        // Pick all coins one by one and update the table[] values
        // after the index greater than or equal to the value of the
        // picked coin
        for(int i=0; i<m; i++){

            for(int j=S[i]; j<=n; j++) {
                table[j] += table[j - S[i]];
                for(int ind =0;ind<=n;ind++){
                }
            }
        }
        return table[n];
    }

}
