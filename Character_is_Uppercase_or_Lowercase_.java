import java.util.*;
public class Characters
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.nextLine().charAt(0);
        if(ch>='A' && ch<='Z') System.out.print("uppercase alphabet");
        else if(ch>='a' && ch<='z') System.out.print("lowercase alphabet");
        else System.out.print("not an alphabet");
    }
}