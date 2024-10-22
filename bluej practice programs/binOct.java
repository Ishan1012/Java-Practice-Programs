import java.util.*;

class binOct
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int a=sc.nextInt();
        
        int n=a,o=0,p=0;
        while(n>0)
        {
            int d=n%10;
            if(d>1 || d<0)
            {
                System.out.println("not binary number");
                System.exit(0);
            }
            o+=Math.pow(8,p++)*d;
            n/=10;
        }
        
        System.out.println("Octal number: "+o);
    }
}