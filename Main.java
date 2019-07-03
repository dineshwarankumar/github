import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String a=s.nextLine();
	int count=0,l=0,k=0;
	for(int i=0;i<a.length();i++)
    {
	    for(int j=i;j<a.length();j++)
	    {
	        if(i!=j)
	        {
	            if(a.charAt(i)==a.charAt(j))
	            {
	            count=j;
	            k=i;
	            break;
	            }
	        }
	    }
	}
	String y=a.substring(k,count);
	     l=y.length();
	System.out.print(l);
	}
}
