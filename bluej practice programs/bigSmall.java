import java.util.*;
class bigSmall
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e,f,g,h=0;
        System.out.println("Enter first no.");
        a=sc.nextInt();
        System.out.println("Enter second no.");
        b=sc.nextInt();
        System.out.println("Enter third no.");
        c=sc.nextInt();
        d=Math.max(a,b);
        e=Math.max(d,c);
        System.out.println(e);
    }
}