class Perimeter
{
    double a;
    double b;
    Perimeter(double l,double bb)
    {
        a=l;
        b=bb;
    }

    double Calculate()
    {
        return 2*(a+b);
    }

    void show()
    {
        System.out.println("Length = "+a);
        System.out.println("Breadth = "+b);
        System.out.println("Perimeter = "+Calculate());
    }
}

class Area extends Perimeter
{
    double h;
    double area;
    Area(double l,double bb,double cc)
    {
        super(l,bb);
        h=cc;
    }

    void doarea()
    {
        area = super.b*h;
    }

    void show()
    {
        super.show();
        System.out.println("Height = "+h);
        System.out.println("Area = "+area);
    }
}