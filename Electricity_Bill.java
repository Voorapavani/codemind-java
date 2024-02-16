import java.util.*;
public class ElectricityBill
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String x=sc.nextLine();
        int n=sc.nextInt();
        double ch,c,s,b;
        if(n<=199)
        {
            ch=1.20;
            c=n*1.20;
        }
        else if(n>200 && n<400){
            ch=1.50;
            c=n*1.50;
        }
        else if(n>=400 && n<600){ 
            ch=1.80;
            c=n*1.80;
        }
        else {
            ch=2.00;
            c=n*2.00;
        }
        if(c>400) 
        {
            s=c*0.15;
        }
        else 
        {
            s=100.00;
        }
        b=c+s;
        System.out.printf("%.2f",b);
    }
}
