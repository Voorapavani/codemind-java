import java.util.*;
public class Largest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.print(a);
        }
        else if(b>c && b>a)
        {
            System.out.print(b);
        }
        else if(c>a && c>b)
        {
            System.out.print(c);
        }
    }
}