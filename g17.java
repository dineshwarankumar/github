import java.util.*;
public class g17
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int temp=m;
        int n=0,c=0;
        while(m>0)
        {
            n=m%10;
            m=m/10;
            c=c+(n*n*n);
        }
        if(c==temp)
            System.out.print("yes");
        else
        System.out.print("no");
        }
    }



