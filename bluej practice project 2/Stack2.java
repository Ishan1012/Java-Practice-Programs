import java.util.*;

class Stack2 
{
    int top;
    int cap;
    int stk[];

    Stack2(int nn)
    {
        cap=nn;
        stk = new int[cap];
        top=-1;
    }

    public void push(int num)
    {
        if(top<cap-1)
        {
            top++;
            stk[top]=num;
        }
        else
            System.err.println("Stack Overflow!");
    }

    public void Pop()
    {
        if(top<1)
            System.err.println("Stack Underflow!");
        else
        {
            int temp=stk[top--];
            System.out.println("Element popped="+temp);
        }
    }

    void display()
    {
        if(top<1)
            System.err.println("Stack Underflow!");
        else
            for(int i=top;i>=0;i--)
                System.out.println(stk[i]);
    }

    public static void main(String args[])
    {
        Stack2 obj = new Stack2(5);
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter elements: ");
            int a=sc.nextInt();
            obj.push(a);
        }
        
        obj.display();
        
        obj.Pop();
        obj.Pop();
        obj.Pop();
        
        obj.display();
    }
}