import java.util.*;

class magic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int a=sc.nextInt();
        
        int n=a,sum=0;
        
        while(sum>9 || n>0)
        {
            if(n==0)
            {
                n=sum;
                sum=0;
            }
            int d=n%10;
            sum=sum+d;
            n=n/10;
        }
        
        if(sum==1)
        System.out.println("Magic number");
        else
        System.out.println("not Magic number");
    }
}