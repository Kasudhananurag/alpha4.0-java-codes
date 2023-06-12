import java.util.*;

public class largestnum {

    public static int largestNumber(int arr[]){
        int largrst = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>largrst){
                largrst = arr[i];
            }
        }
        return largrst;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of array you want to find the largest number of!");
        size = sc.nextInt();
        
        int arr[] = new int[size];

        System.out.println("Enter the elements of array");

        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Largest number in the array is = "+largestNumber(arr));

    }
}
