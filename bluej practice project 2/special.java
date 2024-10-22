import java.util.*;

class special
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int a=sc.nextInt();
        
        int n=a,s=0,p=1;
        if(n!=0)
        {
            int d=n%10;
            s+=d;
            p*=d;
            n/=10;
        }
        
        boolean check=s+p==a;
        
        if(check)
        System.out.println("Special");
        else
        System.out.println("not Special");
    }
}