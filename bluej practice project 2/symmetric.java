import java.util.*;

class symmetric
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

        int c=0;

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                if(ar[i][j]!=ar[j][i])
                    c++;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(ar[i][j]);
            System.out.println();
        }
        if(c==0)
            System.out.println("Symmetric");
        else if(c>0)
            System.out.println("Not Symmetric");
    }
}