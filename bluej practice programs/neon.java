import java.util.*;

class neon
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int a=sc.nextInt();
        
        int sq=a*a;
        int sum=0;
        while(sq!=0)
        {
            int d=sq%10;
            sum=sum+d;
            sq=sq/10;
        }
        
        if(sum==a)
        System.out.println("Neon no.");
        else
        System.out.println("not Neon no.");
    }
}