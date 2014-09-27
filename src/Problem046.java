import java.util.ArrayList;
import java.util.List;

/**
 * Created by sreedish.ps on 27/09/14.
 */
public class Problem046 {
    public static void main(String[] args) {
        int limit = 1000000;
        boolean arr[] = MathHelper.primeSieve(limit);
        List<Long> SQ = new ArrayList<Long>();

        for(Long i =1L;i<1000000L;i++){
            SQ.add(i*i);
        }


        for(int i =5 ;i < limit ; i+=2){
            //take every odd number check if  composite
            if(arr[i]){
                continue;
            }
            //if odd and composite check if can be expressed as prime + 2 * (square)
            boolean flag = false;
            for(int prime =2; prime<limit;prime++){
                if(!arr[prime]){
                    continue;
                }
                for(int num = 1 ;num<i;num++){
                    if(i == (prime + 2 * (num * num))){
                        flag = true;
                        break;
                    }
                }
                if(flag){
                    break;
                }

            }
            if(!flag){
                System.out.println(i);
                break;
            }
        }

    }
}

