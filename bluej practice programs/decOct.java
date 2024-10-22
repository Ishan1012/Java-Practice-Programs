import java.util.*;

class decOct
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int a=sc.nextInt();
        
        int n=a;
        String o="";
        while(n>0)
        {
            int d=n%8;
            o=Integer.toString(d)+o;
            n/=8;
        }
        
        System.out.println("Octal number= "+o);
    }
}
