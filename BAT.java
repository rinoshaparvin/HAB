import java.io.*;
import java.util.*;
public class BAT
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
char ch;
ch=scan.next().charAt(0);
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')
{
System.out.println("Alphabet");
}
else
{
System.out.println("Not Alphabet");
}
}
}
