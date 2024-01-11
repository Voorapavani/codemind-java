import java.util.*;
public class Salary
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double bs=sc.nextDouble();
        double da,hra,gs;
        if(bs<=10000)
        {
            da=bs*80/100;
            hra=bs*20/100;
            gs=bs+da+hra;
        }
        else if(bs<=20000)
        {
            da=bs*90/100;
            hra=bs*25/100;
            gs=bs+da+hra;
        }
        else
        {
            da=bs*95/100;
            hra=bs*30/100;
            gs=bs+da+hra;
        }
        System.out.printf("%.2f",gs);
    }
}