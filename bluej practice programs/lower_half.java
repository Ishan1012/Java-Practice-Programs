import java.util.*;

class lower_half
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int ar[][]=new int[n][n];

        //Input
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter element: ");
                ar[i][j]=sc.nextInt();
        }

        //Lower half
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i+j)>=(n-1))
                    System.out.print(ar[i][j]+" ");
                else
                    System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}