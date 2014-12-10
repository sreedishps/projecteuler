import java.math.BigInteger;

/**
 * Created by sreedish on 10/12/14.
 */
public class Problem057 {
    public static void main(String[] args){
        BigInteger  n = new BigInteger("3");
        BigInteger d = new BigInteger("2");
        BigInteger tempn,tempd;
        int counter = 0;
        for(int i=0;i<1000;i++){
            if(n.toString().length() > d.toString().length()){
                counter++;
            }
            //System.out.println(n+"  "+d);
            tempn = n.add(d).add(d);
            tempd = n.add(d);
            n = tempn;
            d = tempd;
        }
        System.out.println(counter);
    }
}
