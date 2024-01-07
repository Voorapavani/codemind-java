import java.util.Scanner;
public class Area
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    double a=sc.nextDouble();
    double b=sc.nextDouble();
    double c=sc.nextDouble();
    double s,h;
    s=(a+b+c)/2;
    h=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.printf("%.2f",h);
    }
}
