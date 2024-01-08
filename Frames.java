import java.util.Scanner;
public class Frames
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int fra;
        fra=(2*(a+b))*c;
        System.out.println(fra);
    }
}