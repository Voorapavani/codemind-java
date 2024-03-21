import java.util.*;
public class MatrixAddition
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[][] arr1=new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        int c=sc.nextInt();
        int d=sc.nextInt();
        int[][] arr2=new int[c][d];
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<d;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        int[][] sum=new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                sum[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}