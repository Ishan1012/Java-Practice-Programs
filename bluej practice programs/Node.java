import java.util.*;

class Node
{
    int value;
    Node next;
    Node()
    {
        value=0;
        next=null;
    }

    void addNode()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value: ");
        int a=sc.nextInt();

        this.value=a;
        this.next=null;
    }

    void addNodes(int a,int n,Node b)
    {
        if(a==n)
            return ;
        else
        {
            b.addNode();
            b.next=new Node();
            addNodes(a+1,n,b.next);
        }
    }

    void deleteNode(int i,int a,Node n)
    {
        if(n!=null)
        {
            int v=n.value;

            if(i==a)
            {
                System.out.println("Removed "+v+" from position "+i);
                n.value=0;
                return;
            }
            else
                deleteNode(i,--a,n.next);
        }
    }

    void deleteNodeVal(int n,Node A)
    {
        if(A!=null)
        {
            int v=A.value;

            if(n==v)
            {
                System.out.println("Removed "+v);
                A.value=0;
                return;
            }
            else
                deleteNodeVal(n,A.next);
        }
    }

    void printNodes(Node a)
    {
        while(a!=null)
        {
            int n=a.value;
            Node c=a.next;

            if(n!=0)
                System.out.println(n+" ");

            a=c;
            c=null;
        }
    }

    public static void main(String args[])
    {
        Node a=new Node();

        a.addNodes(0,5,a);
        a.deleteNode(3,5,a);
        a.deleteNodeVal(4,a);
        a.printNodes(a);
    }
}