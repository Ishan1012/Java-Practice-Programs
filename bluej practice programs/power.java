import java.util.*;

class power
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int a=sc.nextInt();
        System.out.println("Enter power: ");
        int b=sc.nextInt();
        
        power obj = new power();
        int c=obj.pow(a,b);
        
        System.out.println("Power: "+c);
    }
    int pow(int a,int b)
    {
        if(b==0)
        return 1;
        return a*pow(a,b-1);
    }
}