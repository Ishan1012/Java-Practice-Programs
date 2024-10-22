import java.util.*;
class ity
{
    int a;
    int b;
    int c;
    ity()
    {
        int a=0;
        int b=0;
        int c=0;
    }

    public static void main()
    {
        ity obj=new ity();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");

        obj.b=sc.nextInt();
        int a=0;
        do
        {
            a++;
            obj.c=a*obj.b;
            System.out.println(obj.b + "x" + a  + "=" + obj.c);

        }while(a<11);

    }
    public static void roll()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3rd letter of your name and i'll tell how your day will be going , although it is not true at all.. but still for fun");
        char i=sc.nextLine().charAt(4); 
        switch(i)
        {
        case 'a':
        System.out.println("better than yesterday");break;
        case 'e':
        System.out.println("okie okie");break;
        case 'i':
        System.out.println("god blessed you my boi");break;
        case 'o':
        System.out.println("may you sparkle throughout the dayy");break;
        case 'u':
        System.out.println("you'll get respected for your good work");break;
        case 'h':
        System.out.println("kid...good news");break;
        case 'n':
        System.out.println("haha,nothing for you suar");break;
        case 's':
        System.out.println("you'll havre reallll smooth dayyiee");break;
        default:
        System.out.println("i honestly have no ideeaa kid , jai shree ram ... still have a good day");
        }
    
    }
}
