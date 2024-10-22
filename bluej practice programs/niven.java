import java.util.*;

class niven
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int a=sc.nextInt();
        
        int n=a;
        int s=0;
        while(n!=0)
        {
            int d=n%10;
            s=s+d;
            n=n/10;
        }
        
        if(n%s==0)
        System.out.println("Niven no");
        else
        System.out.println("not Niven no");
    }
}