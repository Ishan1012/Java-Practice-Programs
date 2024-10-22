import java.util.*;

class Composite
{
    int arr[][];
    int m,n;
    Composite(int mm,int nn)
    {
        m=mm;
        n=nn;
        arr=new int[m][n];
    }

    int isComposite(int p)
    {
        int c=0;

        for(int i=2;i<p;i++)
            if(p%i==0)
                return 1;
        return 0;
    }

    void fill()
    {
        int p=2;

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
            {
                while(p<m*n)
                {
                    if(isComposite(p)==1)
                    {
                        arr[i][j]=p++;
                        break;
                    }
                    else
                        p++;
                }
                if(p>m*n)
                    arr[i][j]=0;
        }
    }

    void display()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Composite obj=new Composite(5,5);

        obj.fill();
        obj.display();
    }
}