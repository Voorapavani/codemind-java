import java.util.*;
public class Number
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n*5>=m)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}