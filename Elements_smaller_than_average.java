import java.util.Scanner;
public class Elements{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        int c=0;
        double avg=Math.floor(sum/n);
        for(int i=0;i<n;i++){
            if(arr[i]<=avg){
                c++;
            }
        }
        System.out.println(c);
    }
}