import java.util.*;

class primeFact
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a=sc.nextInt();

        primeFact obj=new primeFact();
        obj.prime(a,2);
    }

    void prime(int a,int y)
    {
        if(a>1)
        {
            if(a%y==0)
            {
                System.out.print(y+" ");
                prime(a/y,y);
            }
            else
                prime(a,y+1);
        }
    }
}