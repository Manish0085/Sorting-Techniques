public class InsertionSort {

    public int[] sort(int[] arr, int n){

        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return arr;
    }

    // Best case :- O(N)
    // Average case :- O(N^2)
    // Worst case :- O(N^2)
}
