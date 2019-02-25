import java.util.*;
public class g20
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int r=0;
        for(int i=1;i<=m;i++)
        {
            r=m*i;
            System.out.print(r+" ");
        }
    }
}
