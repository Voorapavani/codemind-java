import java.util.*;
public class DragonFruit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<=m;i++)
        {
            if(i%2!=0)
            {
                System.out.printf("%d x %d = %d
",n,i,n*i);
            }
        }
    }
}
