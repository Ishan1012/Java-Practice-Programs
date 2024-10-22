import java.util.*;

class Sum_Series
{
    int x;
    int n;
    double sum;
    Sum_Series()
    {
        x=0;
        n=0;
        sum=0;
    }

    void readLimit()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of x: ");
        x=sc.nextInt();
        System.out.println("Enter value of n: ");
        n=sc.nextInt();
    }

    int getPower(int m,int p)
    {
        if(p==0)
            return 1;
        else if(p==1)
            return m;
        else
            return m*getPower(m,p-1);
    }

    void Sum()
    {
        for(int i=1;i<=n;i++)
            sum=sum+(getPower(x,i*2)/getPower(i,i));
    }

    public static void main(String args[])
    {
        Sum_Series obj = new Sum_Series();

        obj.readLimit();
        obj.Sum();

        System.out.println(obj.sum);
    }
}