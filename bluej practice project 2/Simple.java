class Simple implements Account
{
    long accnum;
    double principal,Rate,Time;

    Simple(long a,double P,double R,double T)
    {
        accnum=a;
        principal=P;
        Rate=R;
        Time=T;
    }

    public double Interest()
    {
        return (principal*Rate*Time)/100;
    }

    public void Display()
    {
        System.out.println("Account details: ");
        System.out.println("Account no.: "+accnum);
        System.out.println("Principal amt.: "+principal);
        System.out.println("Rate of Interest: "+Rate);
        System.out.println("Time: "+Time);
        System.out.println("Intrest amt.: "+Interest());
    }
}