import java.util.*;
public class Fahrenheit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int fe=sc.nextInt();
        double ce=5/9.0*(fe-32);
        System.out.printf("%.2f",ce);
    }
}