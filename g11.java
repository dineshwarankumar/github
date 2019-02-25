import java.util.*;
import java.lang.Math;
public class g11
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        double m=s.nextInt();
        double n=s.nextInt();
        double result=0;
        result=Math.pow(m,n);
        int finals=0;
        finals=(int) Math.round(result);
        System.out.print(finals);
}
}


