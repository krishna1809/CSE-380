/*
reverse of a string
*/

class JString122
{
public static void main(String[] args)
{
String s1="HELLO",s2;

int n=s1.length();
char s3[]=new char [n];
for(int i=n-1;i>=0;i--)
{
//	int j=(n-1)-i;
//s3[j]=s1.charAt(i);
//s2=s2.concat(s3);
System.out.print(s1.charAt(i));
}
//System.out.println(s3);
}
}