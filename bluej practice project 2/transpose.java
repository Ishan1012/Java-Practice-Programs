import java.util.*;

class transpose
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
        
        //Transpose
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(ar[j][i]+" ");
            System.out.println();
        }
    }
}