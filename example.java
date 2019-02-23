import java.util.*;
public class example{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
char c=in.next().charAt(0);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
{
System.out.println("Vowel");
    
}
else if(c=='b'||c=='c'||c=='d'||c=='f'||c=='g'||c=='h'||c=='j'||c=='k'||c=='l'||c=='m'||
	c=='n'||c=='p'||c=='q'||c=='r'||c=='s'||c=='t'||c=='v'||c=='w'||c=='x'||c=='y'||c=='z'||
	c=='B'||c=='C'||c=='D'||c=='F'||c=='G'||c=='H'||c=='J'||c=='K'||c=='L'||c=='M'||c=='N'||
	c=='P'||c=='Q'||c=='R'||c=='S'||c=='T'||c=='V'||c=='W'||c=='X'||c=='Y'||c=='Z')
{
System.out.println("Consonant");
}
    else
    System.out.print("Invalid");
}}

