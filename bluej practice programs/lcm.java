import java.util.*;
class lcm
{
    public static void main()
    {   
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e=0;
        System.out.println("Enter 1st number");
        a=sc.nextInt();
        System.out.println("Enter 2nd number");
        b=sc.nextInt();
        if(a<b)
        {
            c=b;
        }
        else
        {
            c=a;
        }
        for(d=c;d>1;d--)
        {
            if(a%d==0 && b%d==0)
            {
                e=d;
            }
        }
        System.out.println(e);
    }
}