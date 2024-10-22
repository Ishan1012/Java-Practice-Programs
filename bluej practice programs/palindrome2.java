import java.util.*;

class palindrome2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int a=sc.nextInt();
        
        int n=a;
        int rev=0;
        while(n!=0)
        {
            int d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        
        if(rev==a)
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
    }
}