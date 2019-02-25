import java.util.Scanner;
public class g16{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        String pm="";
        int count=0;
        for(int i=n;i<=m;i++)
        {
            count =0;
            for(int j=i;j>=1;j--)
            {
                if(i%j==0)
                {
                    count=count+1;
                }
            }
            if(count==2)
            {
                pm=pm+i+" ";
            }
        }
        System.out.print(pm);
    }
}

