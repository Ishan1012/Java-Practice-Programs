import java.util.*;

class fibo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter limit: ");
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        System.out.print(fibo(i+1)+" ");
    }
    static int fibo(int a)
    {
        if(a==1)
        return 0;
        else if(a==2)
        return 1;
        else
        return fibo(a-1)+fibo(a-2);
    }
}