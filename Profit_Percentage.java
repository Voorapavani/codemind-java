import java.util.Scanner;
public class Profit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double cp=sc.nextDouble();
        double sp=sc.nextDouble();
        double per;
        per=((sp-cp)/cp)*100;
        System.out.printf("%.2f",per);
    }
}