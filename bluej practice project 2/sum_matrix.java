import java.util.*;

class sum_matrix
{
    int ar[][];
    int rn,cn;

    public sum_matrix()
    {
        ar = new int[20][20];

        for(int i=0;i<20;i++)
            for(int j=0;j<20;j++)
                ar[i][j]=0;
    }

    void readRowColumn(int nx,int ny)
    {

        if(nx>20||ny>20)
        {
            System.out.println("Out of range.");
            System.exit(0);
        }

        this.rn=nx;
        this.cn=ny;
    }

    void readMat()
    {
        Scanner sc = new Scanner(System.in);
        int r=0,c=0;

        System.out.println("Enter number of rows: ");
        r=sc.nextInt();
        System.out.println("Enter number of columns: ");
        c=sc.nextInt();

        readRowColumn(r,c);

        int a[][] = new int[this.rn][this.cn];

        System.out.println("Enter elements: ");
        for(int i=0;i<this.rn;i++)
            for(int j=0;j<this.cn;j++)
                a[i][j]=sc.nextInt();

        this.ar=a;
    }

    void showMat()
    {
        int a[][] = this.ar;

        System.out.println("Original matrix: ");
        for(int i=0;i<this.rn;i++)
        {
            for(int j=0;j<this.cn;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }

    void SumMat()
    {
        int r=this.rn,c=this.cn,sr=0,sc=0,j=0;
        int a[][] = new int[r+1][c+1];

        for(int i=0;i<this.rn;i++)
            for(j=0;j<this.cn;j++)
                a[i][j] = this.ar[i][j];

        //adding rows
        for(int i=0;i<this.rn;i++)
        {
            for(j=0;j<this.cn;j++)
                sr=sr+a[i][j];
            a[i][j]=sr;
            sr=0;
        }   

        //adding columns
        for(int i=0;i<this.rn;i++)
        {
            for(j=0;j<this.cn;j++)
                sc=sc+a[j][i];
            a[j][i]=sc;
            sc=0;
        }   

        System.out.println("Sum of rows and columns: ");
        for(int i=0;i<=this.rn;i++)
        {
            for(j=0;j<=this.cn;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        sum_matrix obj = new sum_matrix();

        obj.readMat();
        obj.showMat();
        obj.SumMat();
    }
}