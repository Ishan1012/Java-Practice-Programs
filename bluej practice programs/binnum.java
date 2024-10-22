import java.util.*;

class binnum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int a=sc.nextInt();
        
        binnum obj=new binnum();
        int c=obj.bin(a);
        
        System.out.println("Binary: "+c); 
    }
    int bin(int b)
    {
        if(b>0)
        {
            int d=b%2;
            return bin(b/2)*10+d;
        }
        return 0;
    }
    {
        
    }
}