public class insertion {
    public static void isort(int arr[]){
        for(int i = 1; i<arr.length;i++){ // since current is at 1, prev should be at 0 isilie aage cur = i, and prev = i-1
            int curr = arr[i], prev = i-1;
            //findin corrct postion to insert by pushing the elements behind
            while(prev>=0 && arr[prev]>curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,42,11,3,20};
        isort(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
