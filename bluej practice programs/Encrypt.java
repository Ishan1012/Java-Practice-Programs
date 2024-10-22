import java.util.*;

class Encrypt
{
    String wrd,newwrd;
    int len;
    Encrypt()
    {
        wrd="";
        len=0;
        newwrd="";
    }
    void acceptword()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter String: ");
        String a=sc.nextLine();
        a=a.toUpperCase();
        
        this.wrd=a;
        this.len=a.length();
    }
    void nextVowel()
    {
        for(int i=0;i<len;i++)
        {
            char ch=wrd.charAt(i);
            switch(ch)
            {
                case 'A':ch='E';break;
                case 'E':ch='I';break;
                case 'I':ch='O';break;
                case 'O':ch='U';break;
                case 'U':ch='A';break;
            }
            newwrd=newwrd+ch;
        }
    }
    void disp()
    {
        System.out.println("New Word: "+newwrd);
    }
    public static void main(String args[])
    {
        Encrypt obj=new Encrypt();
        
        obj.acceptword();
        obj.nextVowel();
        obj.disp();
    }
}