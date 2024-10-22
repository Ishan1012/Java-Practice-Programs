import java.util.*;
class prime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a=sc.nextInt();

        prime obj = new prime();
        boolean c=obj.isprime(a,2);

        if(c)
            System.out.println("Prime no");
        else
            System.out.println("not Prime no");
    }

    boolean isprime(int n,int y)
    {
        if(y<n)
        {
            if(n%y==0)
                return false;
            return isprime(n,y+1);
        }
        else
            return true;
    }
}