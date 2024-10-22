import java.util.*;

class constructor2
{
    int a;
    int b;
    constructor2()
    {
        a=0;
        b=0;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        constructor2 obj=new constructor2();
        
        System.out.println("Enter value of a: ");
        obj.a=sc.nextInt();
        System.out.println("Enter value of b: ");
        obj.b=sc.nextInt();
        
        System.out.println((obj.a>obj.b)?obj.a:obj.b+" " + "is greater");
    }
}