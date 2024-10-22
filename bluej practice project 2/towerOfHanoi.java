import java.util.*;

class towerOfHanoi
{
    public static void main(String args[])
    {
        char start='L',inter='C',dest='R';
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter no of disks: ");
        int n=sc.nextInt();
        
        towerOfHanoi obj=new towerOfHanoi();
        obj.move(n,start,inter,dest);
    }
    void move(int n,char s,char i,char e)
    {
        if(n!=0)
        {
            move(n-1,s,e,i);
            System.out.println("Move disk "+n+" from "+s+" to "+e);
            move(n-1,s,i,e);
        }
    }
}