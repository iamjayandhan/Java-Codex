public class binary_search 
{
    public static int search(int arr[],int h,int l,int key)
    {
        if (h>=l)
        {
            int mid = l + (h - l) / 2;

            if (arr[mid]==key)
                return mid;
            if (arr[mid]>key)
                return search(arr,l,mid-1,key);
            return search(arr,mid+1,h,key);
        }
        return -1;
    }

    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int key = 5;

        int res = search(arr, n-1,0, key);
        if (res == -1)
            System.out.println("Element not found!");
        else
            System.out.println("Element is found at the index: "+res+".");
    }
}
