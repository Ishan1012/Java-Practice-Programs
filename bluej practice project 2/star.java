import java.util.*;
class star 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i=0;
        System.out.println("enter number");
        a=sc.nextInt();
        for(i=1;i<=a;i++)
        {
            for(b=1;b<=i;b++)
            {
                System.out.print(b);
            }
            for(b=i-1;b>=1;b--)
            {
                System.out.print(b);
            }
            System.out.println();
        }
    }

    public static void nice()
    {
        Scanner sd=new Scanner(System.in);
        int p,q,r,s=0;
        System.out.println("Enter no.");
        p=sd.nextInt();
        for(r=1;r<=p;r++)
        {
            for(q=1;q<=r;q++)
            {
                System.out.print(q);
            }
           System.out.println();
        }
    }
}