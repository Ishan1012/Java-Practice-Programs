class happy
{
    int n;

    happy()
    {
        n=0;
    }

    void getnum(int nx)
    {
        n=nx;
    }

    int sum_sq_digits(int d)
    {
        int a=d,s=0;

        while(a>0)
        {
            int b=a%10;
            int c=b*b;
            s=s+c;
            a=a/10;
            if(a==0 && s>9)
            {
                a=s;
                s=0;
            }
        }

        return s;
    }

    void isHappy()
    {
        int b=sum_sq_digits(n);
        
        if(b==1)
            System.out.println("Happy Number");
        else
            System.out.println("Not a Happy Number");
    }

    public static void main(String args[])
    {
        happy obj=new happy();

        obj.getnum(68);
        obj.isHappy();

        obj.getnum(12);
        obj.isHappy();
    }
}