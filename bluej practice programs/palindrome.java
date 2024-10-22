class palindrome
{
    public static void main(String args[])
    {
        int a=121;
        
        int n=a;
        int rev=0;
        while(n!=0)
        {
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        
        if(rev==a)
        System.out.println("Palindrome");
        else
        System.out.println("not Palindrome");
    }
}