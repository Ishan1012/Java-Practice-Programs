import java.util.*;

class armnorec
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number: ");
        int a=sc.nextInt();

        if(a==arm(a,0))
            System.out.println("Armstrong no");
        else
            System.out.println("Not Armstrong no");
    }

    static int arm(int a,int s)
    {
        if(a==0)
            return s;
        else
        {
            int d=a%10;
            int c=d*d*d;
            s+=c;
            return arm(a/10,s);
        }
    }
}