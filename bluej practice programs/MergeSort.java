import java.util.*;

class MergeSort
{
    int[] A,B,C;
    int M,N;

    MergeSort(int nx,int ny)
    {
        M=nx;N=ny;
        A=new int[M];
        B=new int[N];
    }

    void inpdata()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A: ");
        for(int i=0;i<M;i++)
        {
            System.out.println("Enter element: ");
            A[i]=sc.nextInt();
        }
        Arrays.sort(A);

        System.out.println("Enter B: ");
        for(int i=0;i<N;i++)
        {
            System.out.println("Enter element: ");
            B[i]=sc.nextInt();
        }
        Arrays.sort(B);
    }

    void merge_sort()
    {
        int c=M+N;

        for(int i=0;i<M;i++)
            for(int j=0;j<N;j++)
                if(A[i]==B[j])
                    c--;

        C=new int[c];

        int p=0,l=0;

        for(int i=0,j=0;i<M&&j<N;i++,j++)
            if(A[i]<B[j])
                C[p++]=B[j];
            else
                C[p++]=A[i];

        for(int i=0;i<M;i++,p++)
            C[p]=A[i];

        for(int i=0;i<N;i++,p++)
            C[p]=B[i];
    }

    void DispArray()
    {
        System.out.println(Arrays.toString(C));
    }

    public static void main(String args[])
    {
        MergeSort obj = new MergeSort(4,6);

        obj.inpdata();
        obj.merge_sort();
        obj.DispArray();
    }
}