import java.util.*;

class selection_sorting
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length: ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)// 3 7 4 5 6 
        {
            for (int j=0; j<n-i-1; j++)
            {
                if(arr[j]<arr[])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("array: ");        

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}