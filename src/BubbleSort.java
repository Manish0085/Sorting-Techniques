public class BubbleSort {

    public int[] sortBySwappingAdjacentAndPuttingLargestAtEnd(int[] arr){
        for (int i = arr.length-1; i >= 0; i--) {
            int didSwap = 0;
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 1){
                break;    //Here time complexity is O(N) and it will be Best Case
            }
        }
        return arr;
    }

    // Best case :- O(N)
    // Average case :- O(N^2)
    // Worst case :- O(N^2)
}
