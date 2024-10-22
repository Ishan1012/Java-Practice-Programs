class Stock
{
    String item;
    int qt;
    int rate;
    int amt;

    Stock(String a,int b,int c)
    {
        item=a;
        qt=b;
        rate=c;
        amt=qt*rate;
    }

    void display()
    {
        System.out.println("Item: "+item);
        System.out.println("Quantity in stock = "+qt);
        System.out.println("Rate = "+rate);
        System.out.println("Amount in stock = "+amt);
    }
}

class Purchase extends Stock
{
    int pqty;
    int prate;
    Purchase(String a,int b,int c,int p,int q)
    {
        super(a,b,c);
        pqty=p;
        prate=q;
    }

    void update()
    {
        super.qt += pqty;
        super.rate = (prate-super.rate!=0)?prate:super.rate;
        super.amt = super.qt*super.rate;
    }

    void display()
    {
        System.out.println("Before: ");
        super.display();

        update();
        System.out.println("\nAfter: ");
        super.display();
    }
}