import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

class matrix
{
    int a[][],delta;
    matrix()
    {
        a=new int[0][0];
        delta=0;
    }

    void input() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ar[] = new String[0];
        int a[][]=new int[0][0];

        System.out.println("Enter matrix: ");
        while(true)
        {
            String t=br.readLine()+" ";
            if(t.equals(" ")||t.equals("e ")||t.equals("end "))
                break;
            ar=addToList(ar,t);
        }

        a=extract(ar);

        this.a=a;
    }

    String[] addToList(String[] ar, String a)
    {
        int n=ar.length;
        String s[]=new String[n+1];

        for(int i=0;i<n;i++)
            s[i]=ar[i];
        s[n]=a;

        return s;
    }

    int[][] extract(String ar[])
    {
        int a[][];
        int w=0,n=ar.length;

        for(int i=0;i<n;i++)
            for(int j=0;j<ar[i].length();j++)
                if(ar[i].charAt(j)==' '||ar[i].charAt(j)==',')
                    w++;

        if(w/n!=n)
        {
            System.out.println("Not a square matrix.");
            System.exit(0);
        }

        a = new int[n][n];
        String t="";
        int x=0,y=0;

        for(int i=0;i<n;i++,x++)
        {
            for(int j=0;j<ar[i].length();j++)
            {
                char ch=ar[i].charAt(j);
                if(Character.isDigit(ch))
                    t+=ch;
                else if(ch==' '||ch==',')
                {
                    int p=Integer.parseInt(t);
                    a[x][y++]=p;
                    t="";
                }
            }
            y=0;
        }

        return a;
    }
    
    void value()
    {
        int a[][]=this.a;
        int d=0;
        
        if(a.length==1&&a.length==1)
        d=a[0][0];
        else if(a.length==2&&a[0].length==2)
        d=(a[0][0]*a[1][1])-(a[1][0]*a[0][1]);
        
        this.delta=d;
    }

    void display()
    {
        int a[][]=this.a;
        
        System.out.println("Matrix: ");
        for(int i=0;i<a.length;i++)
        System.out.println(Arrays.toString(a[i]));
        
        System.out.println("Delta: "+this.delta);
    }

    public static void main(String args[]) throws Exception
    {
        matrix obj = new matrix();

        obj.input();
        obj.value();
        obj.display();
    }
}