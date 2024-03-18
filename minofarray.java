import java.util.*;
public class minofarray 
{
    public static void main(String args[])    
    {
        int ar[] = {1,4,2,3,6,4,66,444,123,324,241};
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<ar.length;i++)
        {
            if(min>ar[i])
            {
                min = ar[i];
            }
        }
        System.out.println("the minimum element from the array is "+min);
    }
}
