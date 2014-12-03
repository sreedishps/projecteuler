/**
 * Created by sreedish.ps on 28/09/14.
 */
public class Problem254 {
    public static int factarr[];
    public static void main(String[] args) {
        factarr = MathHelper.factorialArray(11);
        long arr[] = new long[151];
        for(int i=1;i<151;i++){
            arr[i] = -1;
        }
        long i =1;
        boolean flag = false;
        int sum =0;
        int counter = 0;
        int limit = 50;
        while(true) {
            int sfi = sf(new Integer(i+""));
            if(sfi > limit){
                i++;
                continue;
            }
            //populate arr
            if(arr[sfi] == -1){
                arr[sfi] = i;
                counter++;
                sum+=MathHelper.sumOfDigits(new Integer(i+""));
            }
            if(counter == limit){
                System.out.println(sum);
                break;
            }
            i++;
        }


    }
    public static int sf(int n){
        int sum =0;
        while(n>0){
            sum += factarr[n%10];
            n=n/10;
        }
        return MathHelper.sumOfDigits(sum);
    }
}
