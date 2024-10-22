import java.util.*;

class fact2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int a=sc.nextInt();
        
        System.out.println("Fact: "+fact(a));
    }
    static int fact(int a)
    {
        return (a==0)?1:fact(a-1);
    }
}