/**
 * Created by sreedish.ps on 12/06/14.
 * Largest palindrome product
 */
public class Problem004 {
    public static void main(String[] args) {
        int i = 999;
        int prod=0,largest=0;
        
        while(i>=100){
            int j = 999;
            while(j>=100){
                prod = i*j;
                if(isPalindrome(prod)){
                    if(prod > largest){
                        largest = prod;
                    }
                }
                if(prod < largest){
                    break;
                }
                j--;
            }
            i--;
        }
        System.out.println(largest);
    }

    private static boolean isPalindrome(int i) {
        return (i == MathHelper.reverseInt(i));
    }
}

