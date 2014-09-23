import java.util.HashMap;

/**
 * Created by sreedish.ps on 15/09/14.
 */
public class Problem026 {
    public static void main(String[] args) {
        int max =0;
        int ans =0;

       for(int i=2;i<1000;i++){

           //filtering out terminating fractions
           int j =i;
           while(j % 2 == 0){
               j = j/2;
           }
           while(j % 5 == 0){
               j = j/5;
           }
           if(j == 1){
               continue;
           }
            //finding the recurrence cycle length
           HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
           int divident = 1;
           int counter = 1;

           while(true){

                while(divident < i){
                    divident*=10;
                    counter++;
                }


               if(hs.containsKey(divident)){
                   if(max < (counter - hs.get(divident))){
                       max = counter - hs.get(divident);
                        ans = i;
                   }

                   break;
               }

               hs.put(divident,counter);
               divident = divident % i;
           }

       }
        System.out.println(ans);
    }
}
