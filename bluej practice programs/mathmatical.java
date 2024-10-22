import java.util.*;
class mathmatical
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;
        int e=0;
        
        System.out.println("Enter any no");
        a=sc.nextInt();
        System.out.println("Enter any no");
        b=sc.nextInt();
        System.out.println("Enter 1 for +,2 for -,3 for x,4 for/");
        c=sc.nextInt();
        if(c<=1)
        {
            e=a+b;
            System.out.println(e);
        }
        else if(c<=2)
        {
            e=a-b;
            System.out.println(e);
        }
        else if(c<=3)
        {
            e=a*b;
            System.out.println(e);
        }
        else 
        {
            e=a/b;
            System.out.println(e);
        }
        if(c>=4)
        {
            System.out.println("out of bounds , bhad me jao");
        }
    }
}