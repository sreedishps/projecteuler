/**
 * Created by sreedish.ps on 20/09/14.
 */
public class Problem033 {
    public static void main(String[] args) {
        int counter =0;

        for (int num = 11; num <= 99; num++) {
            for (int den = 11; den <= 99; den++) {

                if(MathHelper.HCF(num,den) == 1){
                    continue;
                }

                if(num >= den){
                    continue;
                }

                if(num%10 == 0){
                    continue;
                }
                if(den%10 == 0){
                    continue;
                }

                int a = den%10;
                int b = (den/10) % 10;

                int c = num%10;
                int d = (num/10) % 10;



                if(a != c && a !=d && b != c && b !=d){
                    continue;
                }

                if(a == c){
                    int hcf1 = MathHelper.HCF(b,d);
                    int hcf2 = MathHelper.HCF(den,num);

                    if((b/hcf1) != (den/hcf2)) {
                        continue;
                    }
                    if((d/hcf1) != (num/hcf2)) {
                        continue;
                    }
                }
                if(a == d){
                    int hcf1 = MathHelper.HCF(b,c);
                    int hcf2 = MathHelper.HCF(den,num);

                    if((b/hcf1) != (den/hcf2)) {
                        continue;
                    }
                    if((c/hcf1) != (num/hcf2)) {
                        continue;
                    }
                }
                if(b == c){
                    int hcf1 = MathHelper.HCF(a,d);
                    int hcf2 = MathHelper.HCF(den,num);

                    if((a/hcf1) != (den/hcf2)) {
                        continue;
                    }
                    if((d/hcf1) != (num/hcf2)) {
                        continue;
                    }
                }
                if(b == d){
                    int hcf1 = MathHelper.HCF(a,c);
                    int hcf2 = MathHelper.HCF(den,num);

                    if((a/hcf1) != (den/hcf2)) {
                        continue;
                    }
                    if((c/hcf1) != (num/hcf2)) {
                        continue;
                    }
                }


                System.out.println(num+"/"+den);
                System.out.println(num/MathHelper.HCF(den,num)+"/"+den/MathHelper.HCF(den,num));
                counter++;
            }
        }

        System.out.println(counter);

    }
}
