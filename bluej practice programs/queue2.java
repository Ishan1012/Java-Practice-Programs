class queue2
{
    int que[];
    int capacity;
    int front;
    int rear;
    queue2()
    {
        for(int i=0;i<que.length;i++)
            que[i]=0;
    }

    queue2(int limit)
    {
        capacity=limit;
        front=0;
        rear=-1;
        que=new int[capacity];
    }

    void dataPush(int num)
    {
        if(rear<capacity-1)
        {
            rear++;
            que[rear]=num;
        }
        else
            System.err.println("Queue is full!");
    }

    int dataPop()
    {
        if(rear>0 && front<rear)
        {
            int temp=que[front++];
            return temp;
        }
        else
        {
            System.err.println("Queue is empty!");
            return -9999;
        }
    }

    void QueueDisplay()
    {
        System.out.println("\nQueue: ");
        if(front<rear)
            for(int i=front;i<=rear;i++)
                System.out.print(que[i]+",");
        else
            System.err.println("Queue underflow!");
    }
    
    public static void main(String args[])
    {
        queue2 obj = new queue2(5);
        
        obj.dataPush(1);
        obj.dataPush(5);
        obj.dataPush(2);
        obj.dataPush(4);
        obj.dataPush(3);
        obj.QueueDisplay();
        obj.dataPop();
        obj.dataPop();
        obj.QueueDisplay();
    }
}