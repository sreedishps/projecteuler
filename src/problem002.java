/**
 * Created by sreedish.ps on 04/06/14.
 * Even Fibonacci numbers
 */
public class problem002 {
    public static void main(String[] args) {
        int i=1,j=2,temp =0,sum =0;

        while(j < 4000000) {
            if(j % 2 == 0){
                sum+=j;
            }
            temp = i + j;
            i = j;
            j = temp;
        }
        System.out.println(sum);
    }
}
