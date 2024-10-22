import java.util.*;

class octDec
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int a=sc.nextInt();
        
        int n=a,p=0,b=0;
        while(n>0)
        {
            int d=n%10;
            b+=Math.pow(8,p++)*d;
            n/=10;
        }
        
        System.out.println("Decimal no= "+b);
    }
}