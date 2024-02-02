import java.util.*;
public class Tickets
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=4*n;
        if(x<=1000)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}