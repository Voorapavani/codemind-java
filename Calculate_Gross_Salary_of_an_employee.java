import java.util.Scanner;
public class Salary
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double bs=sc.nextDouble();
        double hra=sc.nextDouble();
        double da=sc.nextDouble();
        double ps=bs*12/100;
        double gs=bs+hra+ps+da;
        System.out.printf("%.2f
",ps);
        System.out.printf("%.2f",gs);
    }
}