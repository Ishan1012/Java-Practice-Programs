import java.util.*;

class fibonacci
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        fibonacci obj = new fibonacci();
        
        System.out.println("Enter limit: ");
        int a=sc.nextInt();
        
        for(int i=0;i<a-1;i++)
        {
            int d=obj.fibo(a);
            
            System.out.println(d+",");
        }
    }
    int fibo(int a)
    {
        if(a==0)
        return 0;
        else if(a==1)
        return 1;
        else
        return fibo(a-1)+fibo(a-2);
    }
}