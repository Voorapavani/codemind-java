import java.util.*;
public class Root
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double x=(int)Math.sqrt(n);
        if(x*x==n)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}
