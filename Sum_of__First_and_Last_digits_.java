import java.util.*;
public class Sum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=n%10;
        while(n>=10)
        {
            n=n/10;
        }
        System.out.print(n+b);
    }
}