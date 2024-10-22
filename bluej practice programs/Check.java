import java.util.*;

class Check
{
    String Str;
    int w;
    Check()
    {
        Str="";
        w=0;
    }

    void InputString()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String a=sc.nextLine();
        a=a.toUpperCase();

        this.Str=a;
    }

    void Counter(int a)
    {
        if(a>=0)
        {
            char ch = Str.charAt(a);
            switch(ch)
            {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                w++;
            }
            Counter(a-1);
        }
    }

    void Disp()
    {
        Counter(Str.length()-1);

        System.out.println("String: "+Str);
        System.out.println("W: "+w);
    }

    public static void main(String args[])
    {
        Check obj = new Check();

        obj.InputString();
        obj.Disp();
    }
}