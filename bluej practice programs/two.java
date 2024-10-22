import java.util.*;
class two
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in); 
        int n , k=0;
        System.out.println("Enter range: ");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter series");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("enter key: ");
        k=sc.nextInt();
        int first=0,beach=0,last=0;
        last=n-1;
        while(first<=last)// 2 3 4 5 6
        {
            beach=(first+last)/2;
            if(k==a[beach])
            {
                System.out.println("key found at "+beach);
                break;
            }
            else if(k<a[beach])
            {
                last=beach-1;
            }
            else 
            {
                first=beach+1;
            }
            if(first>last)
                System.out.println("key not found");
        }
    }
}
