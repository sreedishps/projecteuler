
import java.util.Arrays;

/**
 * Created by sreedish.ps on 30/09/14.
 */
public class Problem052 {
    public static void main(String[] args) {
        for(long i=1;i<1000000000L;i++){

            char[] str = (i+"").toCharArray();
            Arrays.sort(str);

            for(long j=2;j<=6;j++){
                char[] str2 = ((i*j)+"").toCharArray();
                Arrays.sort(str2);

                String s1 = new String(str);
                String s2 = new String(str2);

                //System.out.println(s1+"  "+s2);

                if(s1.length() != s2.length()){
                    break;
                }

                if(!s1.equals(s2)){
                    break;
                }
                if(j == 6){
                    System.out.println(i);
                    return;
                }
            }


        }
    }
}
