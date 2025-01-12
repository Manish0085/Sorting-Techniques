public class SelectionSort {

    public int[] sortBySelectingMin(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    int temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    // Best case :- O(N^2)
    // Average case :- O(N^2)
    // Worst case :- O(N^2)
}
