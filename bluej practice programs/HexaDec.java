import java.util.*;

class HexaDec
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        String a=sc.nextLine();
        
        int d=0,h=0,n=a.length();
        for(int i=n-1;i>=0;i--)
        {
            char ch=a.charAt(i);
            switch(ch)
            {
                case 'A':d=10;break;
                case 'B':d=11;break;
                case 'C':d=12;break;
                case 'D':d=13;break;
                case 'E':d=14;break;
                case 'F':d=15;break;
                default:d=Integer.parseInt(""+ch);
            }
            h+=Math.pow(16,i)*d;
        }
        
        System.out.println("Hexadec no: "+h);
    }
}