import java.util.Scanner;
public class Days
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int y=a/365;
        int w=(a%365)/7;
        System.out.println(y);
        System.out.print(w);
    }
}