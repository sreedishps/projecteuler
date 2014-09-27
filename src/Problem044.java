import java.util.HashMap;

/**
 * Created by sreedish.ps on 27/09/14.
 */
public class Problem044 {
    static HashMap<Integer,Long> hm;
    public static void main(String[] args) {
        hm = new HashMap<Integer, Long>();
        //index first 10000 pentagon numbers
        for(int i=1;i<100000;i++){
            hm.put(i,new Long(i * (3*i -1))/2);
        }

        //find the pentagon pair for which sum is a pentagon
        for(int i=1;i<10000;i++){
            System.out.println(i);
            for(int j=i+1;j< Math.min((i + 1 + 50), 9999);j++){
                Long sum = hm.get(i) + hm.get(j) ;
                Long diff = hm.get(j) - hm.get(i) ;

                if(hm.containsValue(diff)){
                 // System.out.println(hm.get(i) +"  "+ hm.get(j)+"  "+diff);
                    if(hm.containsValue(sum)){
                        System.out.println("found" + hm.get(i) +"  "+ hm.get(j)+"  "+diff);
                        break;
                    }

                }
                if((hm.get(j) - hm.get(j-1)) > hm.get(i) ){
                   // System.out.println("break "+j);
                    break;
                }
            }
        }
    }
}
