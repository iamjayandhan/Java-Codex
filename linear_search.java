public class linear_search 
{
    public static int search(int arr[],int x)
    {
        int n = arr.length;
        for (int i=0;i<n;i++)
        {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    
    public static void main(String args[])
    {
        int arr[] = {12,23,34,45,56,7,632,320};
        int x = 34;
        int result = search(arr,x);

        if (result == -1)
            System.out.println("Element not found!");
        else
            System.out.println("Element is found at the position "+(result+1)+".");
    }




}
