import java.util.*;
public class Grade
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        double e=sc.nextDouble();
        double per=((a+b+c+d+e)/500)*100;
        if(per>=90)
        {
            System.out.print("Grade A");
        }
        else if(per>=80)
        {
            System.out.print("Grade B");
        }
        else if(per>=70)
        {
            System.out.print("Grade C");
        }
        else if(per>=60)
        {
            System.out.print("Grade D");
        }
        else if(per>=40)
        {
            System.out.print("Grade E");
        }
        else
        {
            System.out.print("Grade F");
        }
    }
}