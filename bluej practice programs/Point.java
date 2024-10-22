import java.util.*;

class Point
{
    int x,y;
    Point()
    {
        x=0;
        y=0;
    }
    void readPoint()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter value of x: ");
        int x=sc.nextInt();
        System.out.println("Enter value of y: ");
        int y=sc.nextInt();
        
        this.x=x;
        this.y=y;
    }
    Point midPoint(Point A,Point B)
    {
        Point C=new Point();
        int x1=A.x;
        int y1=A.y;
        int x2=B.x;
        int y2=B.y;
        
        C.x=(x1+x2)/2;
        C.y=(y1+y2)/2;
        
        return C;
    }
    void displayPoint()
    {
        System.out.println("Point: ");
        
        System.out.println("X: "+this.x);
        System.out.println("Y: "+this.y);
    }
    public static void main(String args[])
    {
        Point obj1=new Point(),
        obj2=new Point();
        
        obj1.readPoint();
        obj2.readPoint();
        obj1.displayPoint();
        obj2.displayPoint();
        obj2=obj2.midPoint(obj1,obj2);
        obj2.displayPoint();
    }
}