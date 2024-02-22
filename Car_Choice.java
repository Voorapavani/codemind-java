import java.util.*;
public class CarChoice
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int y1=sc.nextInt();
            int y2=sc.nextInt();
            double a=(double)y1/x1;
            double b=(double)y2/x2;
            if(a<b) System.out.println("-1");
            else if(a==b) System.out.println("0");
            else if(a>b) System.out.println("1");
        }
    }
}
