import java.util.*;
public class Numbers
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            String x = Integer.toString(arr[i]);
            if(x.length()%2==0)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}