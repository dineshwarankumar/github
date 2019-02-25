import java.util.*;
public class g12
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=m;
        int x=0;
        int a=0;
        if(n<=1000)
        {
        while(n!=0)
        {
            x = n % 10;
            a = a * 10 + x;
            n = n / 10;
        }
        }
        if(a==m)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}

