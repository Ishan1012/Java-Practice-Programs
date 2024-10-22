import java.util.*;

class Stack
{
    int top=-1;
    int n=5;
    int stk[] = new int[n];
    void push(int num)
    {
        if(top<n-1)
        {
            top++;
            stk[top]=num;
        }
        else
            System.err.println("Stack Overflow!");
    }

    void pop()
    {
        if(top<1)
            System.err.println("Stack Underflow!");
        else
        {
            int temp=stk[top];
            top--;
            System.out.println("Element popped: "+stk[top]);
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Stack obj = new Stack();

        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the element: ");
            int n1=sc.nextInt();
            obj.push(n1);
        }

        System.out.println(Arrays.toString(obj.stk));
        
        for(int i=0;i<6;i++)
        obj.pop();
        
        System.out.println(Arrays.toString(obj.stk));
        
        obj.push(5);
        
        System.out.println(Arrays.toString(obj.stk));
    }
}