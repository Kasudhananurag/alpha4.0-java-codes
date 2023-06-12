import java.util.*;

public class smallestnum {

    public static int smallestNumber(int arr[]){
        int smallest = arr[0];
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

        System.out.println("smallest number in the array is = "+smallestNumber(arr));

    }
}
