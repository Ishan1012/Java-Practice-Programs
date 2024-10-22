import java.util.*;

class Change
{
    String str;
    String newstr;
    int len;
    Change()
    {
        str="";
        newstr="";
        len=0;
    }

    void inputword()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String a=sc.nextLine();

        this.str=a;
    }

    char caseconvert(char ch)
    {
        if(Character.isUpperCase(ch))
            return Character.toLowerCase(ch);
        else
            return Character.toUpperCase(ch);
    }

    void recchange(int l)
    {
        if(l>=0)
        {
            char ch=str.charAt(l);
            char ch2=caseconvert(ch);
            recchange(l-1);
            newstr=newstr+ch2;
        }
    }

    void display()
    {
        System.out.println("Original String: "+str);
        recchange(str.length()-1);
        System.out.println("New String: "+newstr);
    }

    public static void main(String args[])
    {
        Change obj = new Change();

        obj.inputword();
        obj.display();
    }
}