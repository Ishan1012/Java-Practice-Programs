import java.util.*;

class theseries
{
    int limit;
    int arr[];

    theseries()
    {
        limit=0;
        arr=new int[0];
    }

    void readList()
    {
        int a[];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter limit: ");
        limit=sc.nextInt();

        if(limit>150)
        {
            System.out.println("Out of limit.");
            System.exit(0);
        }

        a=new int[limit];

        for(int i=0;i<limit;i++)
        {
            System.out.println("Enter element: ");
            a[i]=sc.nextInt();
        }

        this.arr=a;
    }

    int IsPrime(int num,int y)
    {
        if(num>y)
        {
            if(num%y==0)
                return 0;
            return IsPrime(num,y+1);
        }
        else
            return 1;
    }

    void PrintPrimes()
    {
        System.out.println("Prime numbers: ");
        for(int i=0;i<limit;i++)
        {
            int n=IsPrime(arr[i],2);
            if(n==1)
                System.out.print(arr[i]+",");
        }
    }

    public static void main(String args[])
    {
        theseries obj = new theseries();

        obj.readList();
        obj.PrintPrimes();
    }
}