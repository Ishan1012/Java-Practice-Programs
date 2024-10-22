import java.util.*;

class decHexa
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int a=sc.nextInt();
        
        int n=a;
        String h="",p="";
        while(n>0)
        {
            int d=n%16;
            switch(d)
            {
                case 10:p="A";break;
                case 11:p="B";break;
                case 12:p="C";break;
                case 13:p="D";break;
                case 14:p="E";break;
                case 15:p="F";break;
            }
            h=(d>9)?p:d+h;
            n/=16;
        }
        
        System.out.println("Hexadec no= "+h);
    }
}