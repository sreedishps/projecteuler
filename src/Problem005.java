/**
 * Created by sreedish.ps on 15/06/14.
 */
public class Problem005 {
    public static void main(String[] args) {
        int count = 2520,i;
       while(true){
           for( i=1;i<=20;i++){
               if(count % i != 0){
                   break;
               }
           }
           if(i == 21){
               System.out.println(count);
               break;
           }
           count+=2520;
       }
    }
}
