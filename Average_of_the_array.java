import java.util.*;
public class Average
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
        double sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        double avg=0;
        avg=sum/n;
        System.out.printf("%.2f",avg);
    }
}