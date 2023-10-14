// program to count total no. of vowels and constants in a string

class JString124
{
public static void main(String[] args)
{
String s1="Hello Students *$%",s2;
s2=s1.toLowerCase();
int n=s1.length();
int vow=0,con=0;
for(int i=0;i<n;i++)
{
	char c=s2.charAt(i);
	if(c=='a' || c=='e' || c=='i'||c=='o'||c=='u')
	{
		vow++;
	}
	else if(s2.charAt(i)>'a' && s2.charAt(i) <'z')	//or-> if(c!=' ') only for which has words as it will constants is 12
	{
		con++;
	}
}
System.out.println(s1);
System.out.println("Vowels:"+vow+" Constants:"+con);
}}