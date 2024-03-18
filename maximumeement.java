import java.util.*;
public class maximumeement 
{
    public static void main(String args[])
    {
        int ar[] = {1,2,4,22,5,33,53,223,1000};
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<ar.length;i++)
        {
            if(ar[i]>largest){
                largest = ar[i];
            }
        }
        System.out.println("the largest number of the array is "+largest);
    }
}
