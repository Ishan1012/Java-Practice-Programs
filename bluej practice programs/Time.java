import java.util.*;

class Time
{
    int hr,min;
    public Time()
    {
        hr=0;
        min=0;
    }
    void input(int h,int m)
    {
        hr=h;
        min=m;
    }
    Time addTime(Time t1,Time t2)
    {
        Time t3=new Time();
        
        t3.min=t1.min+t2.min;
        t3.hr=t1.hr+t2.hr+(t3.min/60);
        t3.min=t3.min%60;
        
        return t3;
    }
    void display()
    {
        System.out.println("Time = "+hr+" hr "+min+" min.");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int hour,minutes;
        Time t1=new Time(),
             t2=new Time(),
             t3=new Time();
        
        System.out.println("Enter Time t1(hr min): ");
        hour=sc.nextInt();
        minutes=sc.nextInt();
        t1.input(hour,minutes);
        
        System.out.println("Enter Time t2(hr min): ");
        hour=sc.nextInt();
        minutes=sc.nextInt();
        t2.input(hour,minutes);
        
        t3=t3.addTime(t1,t2);
        
        System.out.println("Time 1: ");
        t1.display();
        System.out.println("Time 2: ");
        t2.display();
        System.out.println("Time 3: ");
        t3.display();
    }
}