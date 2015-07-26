
public class Problem145 {
  public static void main(String[] args) {
    System.out.println(count(1000000000l));
  }

  private static long count(Long num) {
    long counter = 0;

    for(Long j = 1l ; j < num ; j++){

      //Check 0 in the end
      if (j % 10 == 0) continue;
      long i =j;
      long sum = i;
      long rev =0l;

      while(i > 0){
        rev = (rev * 10) + (i % 10);
        i = i/10;
      }

      sum = sum + rev;

      while(sum > 0){
        if(sum % 2 == 0){
          break;
        }
        sum = sum /10;
      }
      if(sum == 0){
        counter++;
      }
    }
    return counter;
  }



}
