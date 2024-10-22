import java.util.*;
class hcf
{
     public static void main()
    { 
        Scanner sc=new Scanner (System.in);
        int a=0,b=0,c=0,d=0,e=0;
        System.out.println("Enter your first no.");
        a=sc.nextInt();
        System.out.println("Enter your second no.");
        b=sc.nextInt();
        if(a>b)
        {
            c=b;
        }
        else
        {
         c=a;
        }
        for(d=1;d<=c;d++)
        {
        if(a%d==0 && b%d==0)
        {
            e=d;
        }
        }
        System.out.println(e);
}
}

