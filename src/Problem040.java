/**
 * Created by sreedish.ps on 22/09/14.
 */
public class Problem040 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        int i =1;

        while(str.length() < 1000000){
            str.append(i);
            i++;
        }

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(9));
        System.out.println(str.charAt(99));
        System.out.println(str.charAt(999));
        System.out.println(str.charAt(9999));
        System.out.println(str.charAt(99999));
        System.out.println(str.charAt(999999));
    }
}
