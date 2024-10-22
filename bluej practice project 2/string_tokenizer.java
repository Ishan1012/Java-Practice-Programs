import java.util.*;

class string_tokenizer
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String a=sc.nextLine();

        StringTokenizer data = new StringTokenizer(a);
        
        int l=data.countTokens();
        String s="",r="";
        for(int i=0;i<l;i++)
        {
            s=data.nextToken();
            r=s+" "+r;
        }
        System.out.println(r);
    }
}