import java.util.*;
public class g13
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        if(m==0||m==1)
        {
            System.out.print("no");
        }
        else
        {
        for(int i=2;i<=m/2;++i)
        {
            if(m%i==0)
            {
            System.out.println("no");
            break;
            }
        else
        {
        System.out.print("yes");
        break;
        }
        }
        }
    }
}
