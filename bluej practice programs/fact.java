import java.util.*;

class fact
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int f=sc.nextInt();
        
        fact obj = new fact();
        int a=obj.fac(f);
        
        System.out.println("Factorial: "+a);
    }
    int fac(int n)
    {
        if(n==0)
        return 1;
        return n*fac(n-1);
    }
}