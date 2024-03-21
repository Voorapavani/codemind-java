import java.util.*;
public class CompareTriplets
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[3];
        int[] b=new int[3];
        for(int i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            b[i]=sc.nextInt();
        }
        int n=0;
        int m=0;
        for(int i=0;i<3;i++)
        {
            if(a[i]>b[i])
            {
                n++;
            }
            else if(a[i]<b[i])
            {
                m++;
            }
        }
        System.out.print(n+" "+m);
    }
}