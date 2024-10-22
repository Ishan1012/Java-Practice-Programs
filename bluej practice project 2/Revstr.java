import java.util.*;

class Revstr
{
    String Str;
    String Revst;

    Revstr()
    {
        Str="";
        Revst="";
    }

    void getStr()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String a=sc.nextLine();

        this.Str=a;
    }

    void recReverse(int l)
    {
        if(l>=0)
        {
            char ch=Str.charAt(l);
            Revst+=ch;
            recReverse(l-1);
        }
    }

    void check()
    {
        recReverse(Str.length()-1);
        
        if(Revst.equals(Str))
            System.out.println("Palindrome ");
        else
            System.out.println("Not Palindrome ");
    }
    
    public static void main(String args[])
    {
        Revstr obj = new Revstr();
        
        obj.getStr();
        obj.check();
    }
}