import java.util.*;

class Pronic
{
    int num;
    Pronic()
    {
        num=0;
    }

    void acceptnum()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter no.:");
        int a=sc.nextInt();

        this.num=a;
    }

    boolean isPronic(int v)
    {
        if(v>1)
        {
            int n=v*(v-1);
            if(n==num)
                return true;
            else
                return isPronic(v-1);
        }
        else
            return false;
    }

    void check()
    {
        if(isPronic(num))
            System.out.println("pronic");
        else
            System.out.println("not pronic");
    }

    public static void main(String args[])
    {
        Pronic obj=new Pronic();

        obj.acceptnum();
        obj.check();
    }
}