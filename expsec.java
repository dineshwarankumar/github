import java.util.Scanner;
public class expsec
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
if(a<0)
{
System.out.print("Invalid");
}
else if(a%2==0)
{
System.out.print("Even");
}
else
System.out.print("Odd");
}
}
