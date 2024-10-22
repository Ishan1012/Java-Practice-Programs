import java.util.*;
class farji
{
    public static void main()
    {
        Scanner farji = new Scanner(System.in);
        System.out.println("Enter the principle for S.I");
        int P=farji.nextInt();
        System.out.println("Enter the Rate");
        int R=farji.nextInt();
        System.out.println("Enter time");
        int T=farji.nextInt();
        int SI=(P*R*T)/100;
        int A=SI+P;
        System.out.println("Simple Intrest = "+SI+" Rs");
        System.out.println("Amount = "+A+" Rs");
    
        
   }
}