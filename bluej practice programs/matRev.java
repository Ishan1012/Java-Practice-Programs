import java.util.*;

class matRev
{
    int arr[][],m,n;
    matRev(int mm,int nn)
    {
        m=mm;
        n=nn;
        arr=new int[m][n];
    }

    void fillarray()
    {
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter number: ");
                arr[i][j]=sc.nextInt();
        }
    }

    int reverse(int x)
    {
        int a=x;
        String s="";
        while(a!=0)
        {
            int d=a%10;
            s=s+d;
            a/=10;
        }

        return Integer.parseInt(s);
    }

    void revMat(matRev p)
    {
        int a[][]=p.arr;

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
            {
                a[i][j]=reverse(a[i][j]);
        }

        this.arr=a;
    }

    void show()
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
        matRev obj=new matRev(3,3),
        obj2=new matRev(3,3);
        
        obj.fillarray();
        obj2.revMat(obj);
        obj2.show();
    }
}