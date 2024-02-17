import java.util.*;
public class Compare
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        if(s1.equals(s2))
        {
            System.out.print("Strings are Equal");
        }
        else
        {
            System.out.print("Strings are not Equal");
        }
    }
}