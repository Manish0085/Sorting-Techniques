public class MergeSort {

    public void mergeSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int mid = (low + high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    public void merge(int[] arr, int low, int mid, int high){
        int[] a = new int[arr.length];
        int k = 0;
        int left = low;
        int right = mid+1;
        while (left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                a[k] = arr[left];
                k++; left++;
            }
            else {
                a[k] = arr[right];
                k++; right++;
            }
        }
        while (left <= mid){
            a[k] = arr[left];
            left++; k++;
        }
        while (right <= high){
            a[k] = arr[right];
            right++; k++;
        }
        for (int i = low; i<= high; i++){
            arr[i] = a[i-low];
        }
    }


    // Best case :- O(NlogN)
    // Average case :- O(NlogN)
    // Worst case :- O(NlogN)
}
