class Register
{
    String stud[];
    int cap;
    int top;
    Register(int max)
    {
        cap=max;
        top=-1;
        stud = new String[cap];
    }

    void push(String n)
    {
        if(top<cap-1)
        {
            top++;
            stud[top]=n;
        }
        else
            System.err.println("OVERFLOW");
    }

    String pop()
    {
        if(top>1)
        {
            String temp=stud[top--];
            return temp;
        }
        else
            return "$$";
    }

    void display()
    {
        if(top>1)
            for(int i=top;i>=0;i--)
                System.out.println(stud[i]+" ");
        else
            System.err.println("Underflow");
    }
}