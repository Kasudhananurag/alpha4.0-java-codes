import java.util.*;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of array you want to erform the search on");
        size = sc.nextInt();
        
        int arr[] = new int[size];

        System.out.println("Enter the elements of array");

        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key to perform search on the array");;

        int key = sc.nextInt();

        for(int i = 0; i<=size; i++){
            if(key == arr[i]){
                System.out.println("Match found for "+key+" at "+(i+1)+"th position");
                break;
            }
        }

    }
}
