import java.util.*;

class fibona
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter limit: ");
        int a=sc.nextInt();

        n_fibo(1,a);
    }

    static void n_fibo(int a,int n)
    {
        if(a==n+1)
            return ;
        else
        {
            System.out.print(fibo(a++)+" ");
            n_fibo(a,n);
        }
    }

    static int fibo(int a)
    {
        return a==1?0:a==2?1:fibo(a-1)+fibo(a-2);
    }
}