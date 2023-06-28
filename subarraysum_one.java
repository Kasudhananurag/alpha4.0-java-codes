public class subarraysum_one {
    public static void subArrays(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            // int start = arr[i];
           
            for(int j = i;j<arr.length;j++){
                // int end = arr[j];
                 currSum = 0;
                for(int k = i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    currSum+=arr[k];
                }
                System.out.println();
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }System.out.println("currentsubarray sum = "+currSum);
            
            
        }System.out.println("Maximum sum  = "+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        subArrays(arr);
    }
}
