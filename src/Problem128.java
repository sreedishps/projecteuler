/**
 * Created by sreedish.ps on 23/09/14.
 */
public class Problem128 {
    public static void main(String[] args) {

        int layer = 0;

        while(true){

            layer++;
            for(int i=1;i<=6;i++){
                for(int j = 1;j<= layer;j++){
                    System.out.println(getElement(layer,i,j));
                    //get top left

                    //get bottom left
                    //get bottom
                    //get bottom right
                    //get top right
                    //get top
                    if(i == 1){
                        System.out.println("top = " +getElement(layer+1,i,j));
                    }
                    if(i == 2 && j == 1) {
                        System.out.println("top = " +getElement(layer+1,i-1,layer+1));
                    }
                    if(i == 2 && j != 1) {
                        System.out.println("top = " +getElement(layer,i,j-1));
                    }
                    if(i == 5 && j != layer) {
                        System.out.println("top = " +getElement(layer,i,j+1));
                    }

                }
            }
            if(layer == 4){
                break;
            }


        }

    }

    private static int getElement(int layer, int slab, int n) {

        if (layer == 0) {
            return 1;
        }
        int start = 2;

        for (int i = 1; i < layer; i++) {
            start += (i *6);
        }
        start += ((slab-1)*layer);
        return start + (n-1);
    }


}
