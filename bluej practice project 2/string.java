import java.util.*;

class string
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter String: ");
        String a=sc.nextLine();
        
        string obj=new string();
        String b=obj.rev(a,0);
        
        System.out.println("Reverse: "+b);
    }
    String rev(String a,int l)
    {
        if(l<a.length())
        {
            char ch=a.charAt(l);
            return rev(a,l+1)+ch;
        }
        return "";
    }
}