/**
 * Created by sreedish.ps on 27/09/14.
 */
public class Problem047 {
    public static void main(String[] args) {
        int limit = 1000000;
        int numfactors =4;
        int counter =0;
        for(int i=2;i<limit;i++){
            if(MathHelper.numberOfFactors(i) == numfactors){
                counter++;
            }
            else{
                counter = 0;
            }
            if(counter == 4){
                System.out.println(i-3);
                break;
            }
        }
    }
}
