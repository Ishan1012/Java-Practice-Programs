import java.util.*;

class dec_Bin
{
    int n;
    int s;
    int i;
    dec_Bin()
    {
        n=0;
        s=0;
        i=0;
    }

    void getdata()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of n: ");
        n=sc.nextInt();
    }

    void recursive(int a)
    {
        if(a>0)
        {
            int d=a%2;
            recursive(a/2);
            s=d+s*10;
        }
    }

    void putdata()
    {
        System.out.println("Decimal number: "+n);
        recursive(n);
        System.out.println("Binary equivalence: "+s);
    }

    public static void main(String args[])
    {
        dec_Bin obj = new dec_Bin();

        obj.getdata();
        obj.putdata();
    }
}