import java.util.*;

class binsearch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];

        for(int i=0;i<5;i++)
        {
            System.out.println("Enter element: ");
            a[i]=sc.nextInt();
        }

        System.out.println("Enter no to search: ");
        int s=sc.nextInt();

        Arrays.sort(a);

        binsearch obj=new binsearch();
        obj.bin(a,s,0,a.length-1);
        System.out.println(1350*154);
    }

    void bin(int a[],int s,int u,int l)
    {
        if(u<l)
        {
            int m=(u+l)/2;

            if(a[m]==s)
            {
                System.out.println("Found at: "+m);
                return ;
            }
            else if(a[m]>s)
                l=m-1;
            else if(a[m]<s)
                u=m+1;
            bin(a,s,u,l);
        }
        else
        {
            System.out.println("Not found.");
            return ;
        }
    }
}