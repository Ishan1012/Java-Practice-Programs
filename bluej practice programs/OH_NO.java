import java.util.*;

class OH_NO 
{
    public static void main()
    {
        Scanner angel=new Scanner(System.in);
        
        System.out.println("Enter number");
        int a=angel.nextInt();
        System.out.println("Enter number");
        int b=angel.nextInt();
        System.out.println("Enter number");
        int c=angel.nextInt();
        
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>c && a>b);
        System.out.println(a>c || a>b);
        System.out.println(!(a>c) && a>b);
        
        boolean t=a>b;
        System.out.println(!t);
    }
}
        