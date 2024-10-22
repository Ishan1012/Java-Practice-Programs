import java.util.*;

class queue
{
    int cap;
    int que[];
    int front;
    int rear;

    queue(int n)
    {
        cap=n;
        que=new int[cap];
        front=0;
        rear=-1;
    }

    void push(int num)
    {
        if(rear<cap-1)
        {
            rear++;
            que[rear]=num;
        }
        else
            System.err.println("Stack Overflow!");
    }

    void pop()
    {
        if(rear>1 && front<rear)
        {
            int temp=que[front++];
            System.out.println("Element popped="+temp);
        }
        else
            System.err.println("Stack Underflow!");
    }

    void display()
    {
        if(rear>1 && front<rear)
        {
            System.out.println("Queue: ");

            for(int i=front;i<=rear;i++)
                System.out.println(que[i]);
        }
        else
        {
            System.err.println("Stck Underflow!");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        queue obj = new queue(5);

        obj.push(1);
        obj.push(5);
        obj.push(2);
        obj.push(4);
        obj.push(3);
        obj.display();
        obj.pop();
        obj.pop();
        obj.display();
    }
}