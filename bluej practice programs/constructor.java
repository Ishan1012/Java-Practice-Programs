import java.util.*;

class constructor
{
    int a;
    int b;

    constructor() // constructor
    {
        a=0; // initialize
        b=3;
    }

    public static void modi()
    {
        Scanner sc=new Scanner(System.in);
        int x=0,y=0;
        constructor obj=new constructor();
        obj.b=6;
        System.out.println(obj.b);

        System.out.println("Enter number: ");
        x=sc.nextInt(); // declaration
        System.out.println("Enter number: ");
        y=sc.nextInt(); // declaration
        System.out.println("Enter number: ");
        int z=sc.nextInt(); // declaration

        if(x<y)
        {
            if(x<z)
            {
                System.out.println("X is smaller. ");
            }
        }
        else if(z>y)
        {
            System.out.println("Y is smaller. ");
        }
        else if(x>y)
        {
            System.out.println("X is greater. ");
        }
        else
        {
            System.out.println("Z is smaller. ");
        }
        
        

        //switch case
        
        int day;
        
        System.out.println("Enter day: ");
        day = sc.nextInt();
        
        switch(day)
        {
            case 1:
            System.out.println("Sunday");break;
            case 2:
            System.out.println("Monday");break;
            case 3:
            System.out.println("Tuesday");break;
            case 4:
            System.out.println("Wednesday addams");break;
            case 5:
            System.out.println("Thursday");break;
            case 6:
            System.out.println("Friday");break;
            case 7:
            System.out.println("Saturday");break;
            default:
            System.out.println("hatt re");break;
            
        }
    }
    public static void fufa()
    {
    Scanner sv=new Scanner(System.in);
    int a=0;
    System.out.println("Enter any no");
    a=sv.nextInt();
    
    if(a%2==0)
    {
    System.out.println("even");
   
    }
    else if(a<=0)
    {
    System.out.println("out of bounds");
    }
    else
    {
    System.out.println("odd");
    }
    }
}