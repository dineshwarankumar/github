import java.util.Scanner;
public class g9
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int sum=0;
        int n=s.nextInt();
        int k=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
}
for(int j=0;j<k;j++)
{
    sum=sum+a[j];
    }
    System.out.print(sum);
}
}
