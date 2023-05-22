import java.util.*;
class akshay
{
    public static void main(String args[])
    {
        int arr[] = {7,3,9,5,7,2,1,8};
        
        for(int j=0;j<arr.length;j++)
        {
            int min = arr[j];
            int index = j;
            for(int i=j+1;i<arr.length;i++)
            {
                if(min>arr[i])
                {
                    min = arr[i];
                    index = i;
                    
                }
            }
            arr[index] = arr[j];
            arr[j] = min;
        }
        for(int k=0;k<arr.length;k++)
        {
            System.out.println(arr[k]);
        }
    }
}