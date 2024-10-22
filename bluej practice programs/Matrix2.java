import java.util.*;

class Matrix2
{
    int ar[][];
    int m;
    int n;
    Matrix2(int mm,int nn)
    {
        m=mm;
        n=nn;
        ar=new int[m][n];
    }

    void fillarray()
    {
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter no.: ");
                ar[i][j]=sc.nextInt();
        }
    }

    Matrix2 subMat(Matrix2 A)
    {
        int B[][]=this.ar;

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                B[i][j]=B[i][j]-A.ar[i][j];
                
        Matrix2 b=new Matrix2(0,0);
        b.ar=B;
        
        return b;
    }

    void display()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(ar[i][j]+" ");
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Matrix2 obj=new Matrix2(3,3),
        obj2=new Matrix2(3,3);

        obj.fillarray();
        obj2.fillarray();
        obj.display();
        obj2.display();
        obj.subMat(obj2);
        obj.display();
    }
}