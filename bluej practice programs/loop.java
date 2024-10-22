import java.util.*;

class loop
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int a=sc.nextInt();
        
        if(a>10)
        {
            System.out.println("Out of bounds.");
            System.exit(0);
        }
        
        int i=0;
        do
        {
            i++;
            System.out.println(i*a);
        }while(i<10);
    }
}