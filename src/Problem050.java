/**
 * Created by sreedish.ps on 20/09/14.
 */
public class Problem050 {
    public static void main(String[] args) {
        int limit = 1000000;
        boolean arr[] = MathHelper.primeSieve(limit);
        int max = 0;
        int maxsum =0;

        for(int i=0;i<limit;i++) {
            int sum =0;
            if(arr[i]){
                int j;
                sum = i;
                int counter = 1;
                for(j = i+1;j<limit; j++){
                    if(arr[j]){
                        sum+=j;
                        counter++;
                    }
                    if(sum  >= limit){
                        break;
                    }
                    if(arr[sum]){
                        if(sum < limit && counter > max){
                            max = counter;
                            maxsum = sum;
                        }
                    }
                }

            }


        }
        System.out.println(maxsum);
    }
}
