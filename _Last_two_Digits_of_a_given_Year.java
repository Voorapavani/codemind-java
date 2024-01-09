import java.util.Scanner;
public class Year
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int x=a%100;
        System.out.printf("%02d",x);
    }
}