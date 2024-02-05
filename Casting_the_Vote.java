import java.util.*;
public class Vote
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=18) System.out.print("YES");
        else System.out.print("NO");
    }
}