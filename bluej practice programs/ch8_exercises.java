import java.util.*;
class ch8_exercises
{
    public static void mian()
    {
        Scanner sc=new Scanner(System.in);
        double a,b,c,d,e,f,g,h=0;
        System.out.println("Enter any number");
        a=sc.nextInt();
        System.out.println("Enter 2nd no");
        b=sc.nextInt();
        System.out.println("Enter 3rd no");
        c=sc.nextInt();
        d=a*a;
        f=b*b;
        g=c*c;
        if (d+f<=g)
        {
            System.out.println("It is a pythagorean triplet");
        }
        else
        {
            System.out.println("no man ");

        }
    }

    public static void fun()
    {
        Scanner sd=new Scanner(System.in);
        int p,q,r,s=0;
        System.out.println("Enter your sales");
        p=sd.nextInt();
        if (p<50000)
        {
            q=p+p*2/100;
            System.out.println("your sales commision is"+" "+q);
        }
        else if( p>=50000 && p<=200000)
        {
            r=p+p*5/100;
            System.out.println("your sales commision is"+" "+r);
        }
        else if(p>200000)
        {
            s=p+p*7/100;
            System.out.println("your sales commision is"+" "+s);

        }

    }

    public static void ganga()
    {
        Scanner sv=new Scanner(System.in);
        int i,j,k,l,m,n=0;
        System.out.println("Enter your grades");
        i=sv.nextInt();
        if (i>75)
        {
            System.out.println("A");
        }
        else if(i<=75 && i>60)
        {
            System.out.println("B");
        }
        else if(i<=60 && i>45)
        {
            System.out.println("C");
        }
        else if(i<=45)
        {
            System.out.println("D");
        }
        
    }
    public static void ryan()
    {
    Scanner sq=new Scanner(System.in);
    int u=0;
    int w=1;
    System.out.println("enter number");
    u=sq.nextInt();
    int v=1;
    do
    {
    w=v*w;
    
    v++;
    }while(v<=u);
    System.out.println("factorial is "+" "+w);    
    }
    
}