import java.util.*;

public class bubblesort {
    public static void bubbleSort(int arr[]){
        for(int pass = 0; pass<arr.length-1;pass++){
            for(int j = 0;j<arr.length-1-pass;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr);
        printArr(arr);
    }
}