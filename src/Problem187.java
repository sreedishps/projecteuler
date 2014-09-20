/**
 * Created by sreedish.ps on 21/09/14.
 */
public class Problem187 {
    public static void main(String[] args) {
        int limit = 30;
        boolean arr[] = MathHelper.primeSieve(limit);

        long counter =0;
        for(int i=2;i<(limit/2);i++){
            if(arr[i]){
                for(int j=i ;j< (limit/2);j++ ){
                    if(arr[j]){
                        if((i*j) < limit){
                            counter++;
                        }
                        else{
                            //System.out.println(i+"  "+j);
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(counter);

    }
}
