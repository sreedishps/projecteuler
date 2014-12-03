/**
 * Created by sreedish.ps on 28/09/14.
 */
public class Problem049 {
    public static void main(String[] args) {
        boolean arr[] = MathHelper.primeSieve(10000);

        for(int i = 1000 ; i<=9999 ; i++){
            if(arr[i]){
                for(int j = i+1;j<=9999;j++){
                    if(arr[j]){
                        if(!MathHelper.isPermutation(i,j)){
                            continue;
                        }
                        int diff = j-i;
                        if((j +diff) < 10000){
                            if(arr[j+diff]){
                                if(MathHelper.isPermutation(i,j+diff))
                                {System.out.println(i+"  "+j+"  "+ (j+diff));}
                            }
                        }
                    }
                }
            }
        }

    }
}
