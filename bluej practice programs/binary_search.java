import java.util.*;
class binary_search
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n, k=0;
        int lower=0,middle=0,upper=0;
        System.out.println("enter range: ");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter series: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter key");
        k=sc.nextInt();// 6 5 4 3 7 8
        upper=n-1;
        while(lower<=upper)
        {
            middle=(upper+lower)/2;
            if(k==a[middle])
            {
                System.out.println("key found at "+middle);
                break;
            }
            else if(k<a[middle])
            {
                upper=middle-1;
            }
            else
                lower=middle+1;
            if(lower>upper)
            {
                System.out.println("key not found");

            }
        }
    }

}