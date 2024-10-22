import java.util.*;

class Binary
{
    long bin;
    long dec;
    Binary()
    {
        bin=0;
        dec=0;
    }

    void readBin()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Binary number: ");
        long a=sc.nextLong();

        this.bin=a;
    }

    int l=0;

    long convertDec(long a)
    {
        if(a==0)
            return 0;
        else if(a==1)
            return 1;
        else
        {
            long i=a%10;
            long p=i*(long)Math.pow(2,l--);
            return p+convertDec(a/10);
        }
    }

    void Show()
    {
        long a=bin;

        while(a>0)
        {
            l++;
            a/=10;
        }

        l--;

        dec = convertDec(bin);
        System.out.println("Decimal number: "+dec);
    }

    public static void main(String args[])
    {
        Binary obj = new Binary();

        obj.readBin();
        obj.Show();
    }
}