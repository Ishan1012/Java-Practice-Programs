class Dairy
{
    String Q[];
    int size;
    int start;
    int end;
    Dairy(int max)
    {
        size=max;
        Q=new String[size];
        start=0;
        end=-1;
    }

    void pushadd(String n)
    {
        if(end<size-1)
        {
            end++;
            Q[end]=n;
        }
        else
            System.err.println("NO SPACE");
    }

    String popadd()
    {
        if(start<end && end>1)
        {
            String temp=Q[start++];
            return temp;
        }
        else
            return "?????";
    }

    void show()
    {
        System.out.println("Addresses: ");
        for(int i=start;i<=end;i++)
            System.out.print(Q[i]+",");
        System.out.println();
    }
}