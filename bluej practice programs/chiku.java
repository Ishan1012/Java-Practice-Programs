import java.util.*;
class chiku 
{
    char a;
    chiku()
    {
        a=' ';
    }

    public static void main()
    {   
        Scanner sc = new Scanner(System.in);
        chiku obj=new chiku();
        
        System.out.println("Enter character: ");
        obj.a=sc.next().charAt(0);
        
        switch(obj.a)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println("vowel");break;
            default:
            System.out.println("Consonant");
        }
    }
}