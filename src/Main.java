import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        QuickSort mS = new QuickSort();
        mS.quickSort(arr, 0, n-1);

//        InsertionSort s = new InsertionSort();
//        s.sort(arr, n);
        for(int a : arr){
            System.out.println(a);
        }
    }
}