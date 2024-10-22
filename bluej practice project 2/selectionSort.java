import java.util.*;

class selectionSort
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

        selectionSort obj=new selectionSort();
        obj.sort(a,0,a.length);

        for(int i=0;i<5;i++)
            System.out.print(a[i]+" ");
    }

    void sort(int a[],int l,int n)
    {
        if(l>=n)
            return ;

        int pos=l;
        for(int j=l+1;j<n;j++)
            if(a[j]<a[pos])
                pos=j;

        int temp=a[l];
        a[l]=a[pos];
        a[pos]=temp;

        sort(a,l+1,n);
    }
}