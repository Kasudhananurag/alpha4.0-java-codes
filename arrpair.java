public class arrpair {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        System.out.println("original array is:");
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("the paired value of array are: ");
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                if(j==i)
                    continue;
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
}
