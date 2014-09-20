/**
 * Created by sreedish.ps on 20/09/14.
 */
public class Problem028 {
    public static void main(String[] args) {

        int dim = 1001;
        int level = (dim/2) + 1;
        int sum = 1;
        int num = 1;
        int offset = 2;
        for(int i =2 ; i<=level;i++ ){
            for(int j=0;j<4;j++){
                num +=offset;
                sum +=num;
            }
            offset+=2;
        }
        System.out.println(sum);
    }
}
