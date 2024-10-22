class Armnum
{
    int n,l;
    Armnum(int nn)
    {
        n=nn;
    }

    int sum_pow(int i)
    {
        if(i<10)
            return (int)i;
        else
        {
            int d=i%10;
            return sum_pow(i/10)+d;
        }
    }

    void isArmstrong()
    {
        int a=n;
        while(a!=0)
        {
            l++;
            a/=10;
        }
        if(sum_pow(n)==n)
            System.out.println("Armstrong no");
        else
            System.out.println("not Armstrong no");
    }

    public static void main(String args[])
    {
        Armnum obj=new Armnum(153);

        obj.isArmstrong();
    }
}