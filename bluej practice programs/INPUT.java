import java.util.*;                                                          

class INPUT
{
    public static void main()
    {
        Scanner ch4 = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int f=ch4.nextInt();
        System.out.println("Enter number: ");
        int g=ch4.nextInt();
        
        int c=f+g;
        System.out.println("Answer"+c);
        c=f-g;
        System.out.println(c);
        c=f*g;
        System.out.println(c);
        c=f/g;
        System.out.println(c);
        c=f%g;
        System.out.println(c);
    }
}