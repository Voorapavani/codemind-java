import java.util.*;
public class Power
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=(int)Math.pow(n,m);
        int c=b%a;
        System.out.print(c);
    }
}