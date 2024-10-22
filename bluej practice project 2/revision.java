import java .util.*;
class revision
{
    int a;
    int b;
    revision()
    {
        a=0;
        b=0;

    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=0;
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        int c=a+b;
        System.out.println("your answer is"+c);

    }

    public static void main1()
    {
       Scanner sc=new Scanner(System.in);
        int x=0,y=0;
        System.out.println("enter any number ");
        x=sc.nextInt();
        System.out.println("Enter your second number");
        y=sc.nextInt();
        if (x<y)
        {
            System.out.println("x is smaller than y");
        }
        else 
        {
            System.out.println("x is greather than y");

        }
    }

    public static void main78()
    {
        Scanner sc=new Scanner(System.in);
        int counties;
         System.out.println(" you will get a country suitable to your personality , else youuuu arrrreee booorrrnnn ttoo bee alonnee");
         int countries=sc.nextInt();
        switch(countries)
        {
            case 1:
            System.out.println("Bharat");break;
            case 2:
            System.out.println("Russia");break;
            case 3:
            System.out.println("U.S.A");break;
            case 4:
            System.out.println("we were born to be alone");break;
        }

    }
    
   public static void fun()
   {
       Scanner sc=new Scanner(System.in);
       double a;
       int d;
       System.out.println("enter any freakin no");
       a=sc.nextInt();
       System.out.println("enter any freakin no again");
       d=sc.nextInt();
       
    }
}


