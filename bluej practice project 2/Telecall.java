class Telecall
{
    long phno;
    int n;
    String name;
    double Amt;
    Telecall(long p,int nn,String na)
    {
        phno=p;
        n=nn;
        name=na;
        Amt=0.0;
    }
    void compute()
    {
        if(n>0 && n<=100)
        Amt=.5;
        else if(n>100 && n<=200)
        Amt=.1*n+.5;
        else if(n>200 && n<=300)
        Amt=1.2*n+.5;
        else
        Amt=1.5*n+.5;
    }
    void dispdata()
    {
        System.out.println("Phone no: "+phno);
        System.out.println("No of calls: "+n);
        System.out.println("Name: "+name);
        System.out.println("Amount: "+Amt);
    }
    public static void main(String args[])
    {
        Telecall obj = new Telecall(1234567890,99,"ishan");
        
        obj.compute();
        obj.dispdata();
    }
}