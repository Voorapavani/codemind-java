import java.util.*;
public class Celsius
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        double fe=(c*9/5.0)+32;
        System.out.printf("%.2f",fe);
    }
}