import java.util.*;

class loop2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int a=sc.nextInt();
        
        for(int i=1;i<11;i++)
        {
            System.out.println(a+"x"+i+"="+(a*i));
        }
    }
}