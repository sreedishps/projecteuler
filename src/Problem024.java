/**
 * Created by sreedish.ps on 14/09/14.
 */
public class Problem024 {
    public static void main(String[] args) {

        int arr[] = {0,1,2,3,4,5,6,7,8,9};


        for(int i=1;i<1000000;i++){
            next(arr);
        }
        for(int i=0;i<10;i++){
            System.out.print(arr[i]);
        }
    }


    private static void next(int[] arr){
        //find next permutation
        int first = 0;
        for(int i=9;i>=1;i--){
            if(arr[i-1] < arr[i]){
                first = i-1;
                break;
            }
        }

        //find ceil(first)
        int ceil = arr[first+1];
        int ceilInd = first + 1;
        for(int i=first+1;i<10;i++){
            if(arr[i] < ceil && arr[i] > arr[first]){
                ceil = arr[i];
                ceilInd = i;
            }
        }

        swapIt(first, ceilInd, arr);
        sort(arr,first+1);
    }

    private static void sort(int[] arr, int ind) {
        for(int i=ind;i<9;i++){
            for(int j=i+1;j<10;j++){
                if(arr[i] > arr[j]){
                    swapIt(i,j,arr);
                }
            }
        }
    }

    private static void swapIt(int first, int ceilInd, int[] arr) {
        int temp = arr[first];
        arr[first] = arr[ceilInd];
        arr[ceilInd] = temp;
    }
}
