/**
 * Created by sreedish.ps on 21/04/15.
 */
public class Problem127 {
  static boolean sieve[];

   public static void main(String[] args) {
    int limit = 120000;
     long counter = 0;
     long startTime = System.nanoTime();
    long sieve[] = new long[limit+1];

     for(int i=1;i<=limit;i++){
       sieve[i] = 1;
     }

     for(int i=2;i<= limit ;i++){
       if(sieve[i] == 1){
         for(int j= i ; j<limit ; j = j+i){
           sieve[j] = sieve[j] * i;
         }
       }
     }




     for(int a =1; a < limit ; a++){
       for(int b = a+1; b<limit;b++){

         int c = a + b;
         if(c >= limit){
           break;
         }

         if((sieve[a] * sieve[b] * sieve[c]) >= c){
           continue;
         }

         if(!GCDcheck(a,b,c)){
           continue;
         }

       //  System.out.println(a+" "+b+" "+c);
         counter+=c;
       }
     }

     System.out.println(counter);
     System.out.println("Time taken (in ms)= "+
       (System.nanoTime() - startTime) / 1E6);
  }

  private static boolean GCDcheck(int i, int j, int k) {

    if(GCDcheck(GCDcheck(i,j),k) != 1)
    return false;

    return true;
  }

  private static int GCDcheck(int i, int j) {
    if (j == 0)
      return i;
    else
      return GCDcheck(j, i % j);
  }

}
