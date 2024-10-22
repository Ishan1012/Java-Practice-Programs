import java.util.*;

class armno
{
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number");
        int n=sc.nextInt();
        
        int a=n,sum=0;
        while(a!=0)
        {
            int d=a%10;
            int c=d*d*d;
            sum+=c;
            a/=10;
        }
        
        if(sum==n)
        System.out.println("Armstrong number");
        else
        System.out.println("not Armstrong number");
    }
}