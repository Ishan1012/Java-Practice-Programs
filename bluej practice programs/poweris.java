import java.util.*;

class poweris
{
    int base;
    int expn;
    double p;

    poweris()
    {
        base=0;
        expn=0;
        p=0;
    }

    int power(int n,int m)
    {
        if(m==0)
            return 1;
        else if(m==1)
            return n;
        else
            return n*power(n,m-1);
    }

    void findresults()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base: ");
        base=sc.nextInt();
        System.out.println("Enter power: ");
        expn=sc.nextInt();

        p=power(base,expn);
    }

    void printresult()
    {
        System.out.println("Result: "+p);
    }

    public static void main(String args[])
    {
        poweris obj = new poweris();

        obj.findresults();
        obj.printresult();
    }
}