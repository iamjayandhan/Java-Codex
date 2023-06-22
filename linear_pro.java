import java.util.Scanner;

public class linear_pro 
{
    public static int search(int arr[],int key)
    {
        int N = arr.length;
        for (int i=0 ; i<N ; i++)
        {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }
    
    public static void main(String args[])
    {
        int arr[];
        int n=0;
        int key=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the number of elements: ");
        n = sc.nextInt();
        arr = new int[n];

        System.out.println("\nEnter those " + n + " elements");  

        for (int i=0 ; i < n ; i++)
            arr[i] = sc.nextInt();

        System.out.println("\nEnter a value to find: ");
        key = sc.nextInt();

        int res = search(arr,key);
        if (res == -1)
            System.out.println("\nElement is not found!");
        else
            System.out.println("\nElement is present at the position "+(res+1)+".");
    }
}
