import java.util.*;

class student
{
    String name;
    double testmark;
    char grade;

    public student()
    {
        name="";
        testmark=0.0;
        grade=' ';
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter name: ");
        name=sc.nextLine();
        System.out.println("Enter testmark: ");
        testmark=sc.nextDouble();
        System.out.println("Enter grade: ");
        grade=sc.next().charAt(0);
    }

    void display()
    {
        System.out.println("Printing details: ");
        System.out.println("===========================");
        System.out.println(name+" - "+testmark+" - "+grade);
        System.out.println("===========================");
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        student obj=new student();

        System.out.println("Enter number of students: ");
        n=sc.nextInt();

        while(n!=0)
        {
            obj.input();
            obj.display();
            System.out.println("----------------------");
            n--;
        }
    }
}