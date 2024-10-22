import java.util.*;

class OddEven
{
    int a[],m;
    OddEven(int mm)
    {
        m=mm;
        a=new int[m];
    }

    void fillarray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array: ");
        for(int i=0;i<m;i++)
        {
            System.out.println("Enter element: ");
            a[i]=sc.nextInt();
        }
    }

    OddEven arrange(OddEven P,OddEven Q)
    {
        int[] aa=P.a,ab=Q.a;
        int c[]=new int[m+m];
        int p=0;

        for(int i=0;i<m;i++)
            if(aa[i]%2==1)
                c[p++]=aa[i];
        for(int i=0;i<m;i++)
            if(ab[i]%2==1)
                c[p++]=ab[i];
        for(int i=0;i<m;i++)
            if(aa[i]%2==0)
                c[p++]=aa[i];
        for(int i=0;i<m;i++)
            if(ab[i]%2==0)
                c[p++]=ab[i];

        OddEven C=new OddEven(p);
        C.a=c;
        return C;
    }

    void display()
    {
        for(int i=0;i<m;i++)
            System.out.print(a[i]+" ");
    }

    public static void main(String args[])
    {
        OddEven obj1= new OddEven(5),
        obj2= new OddEven(5);

        obj1.fillarray();
        obj2.fillarray();
        obj1=obj1.arrange(obj1,obj2);
        obj1.display();
    }
}