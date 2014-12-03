/**
 * Created by sreedish.ps on 28/09/14.
 */
public class Problem053 {
    public static void main(String[] args) {

        int counter =0,counter2 =0;

        for(int i = 1;i<= 100;i++){
            for(int j=0;j<=i;j++){

                if(MathHelper.nCr(i,j) > 1000000){
                    counter++;
                }
                if(MathHelper.nCr(i,j) < 0){
                    counter++;
                }
            }
        }
        System.out.println( counter);
    }
}

