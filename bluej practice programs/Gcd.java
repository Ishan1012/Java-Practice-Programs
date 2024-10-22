import java.util.*;

class Gcd
{
    int num1;
    int num2;

    Gcd()
    {
        num1=0;
        num2=0;
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        num1=sc.nextInt();
        System.out.println("Enter number 2: ");
        num2=sc.nextInt();
    }

    int g=2;

    int gcd(int x,int y)
    {
        if(x>1 && y>1)
        {
            if(x%g==0 && y%g==0)
            {
                return g*gcd(x/g,y/g);
            }
            else
            {
                g++;
                return gcd(x,y);
            }
        }
        else
            return 1;
    }
    
    void display()
    {
        int n=gcd(num1,num2);
        
        System.out.println("GCD: "+n);
    }
    
    public static void main(String args[])
    {
        Gcd obj = new Gcd();
        
        obj.accept();
        obj.display();
    }
}