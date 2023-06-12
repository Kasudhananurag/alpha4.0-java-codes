import java.util.*;

public class smallstnum {

    public static int largestNumber(int arr[]){
        int smallest = Integer.MAX_VALUE;  //-INFINITY
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of array you want to find the smallest number of!");
        size = sc.nextInt();
        
        int arr[] = new int[size];

        System.out.println("Enter the elements of array");

        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Smallest number in the array is = "+largestNumber(arr));

    }
}