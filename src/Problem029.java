import java.util.ArrayList;
import java.util.List;

/**
 * Created by sreedish.ps on 26/09/14.
 */
public class Problem029 {
    public static void main(String[] args) {

        List<Double> set = new ArrayList<Double>();

        for (int a = 2; a <= 100; a++) {
            for (int b = 2; b <= 100; b++) {
                double result = Math.pow(a, b);
                if (!set.contains(result)) {
                    set.add(result);
                }
            }
        }

        System.out.println(set.size());
    }
}
