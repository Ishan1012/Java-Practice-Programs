import java.util.*;

class magic2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int a=sc.nextInt();
        
        int n=a;
        int s=0;
        while(n>0 || s>9)
        {
            if(n==0)
            {
                s=n;
                n=0;
            }
            int d=n%10;
            s=s+d;
            n/=10;
        }
        
        if(s==a)
        System.out.println("Magic no.");
        else
        System.out.println("not Magic no.");
    }
}