/*
(method)function overloading
same function_name but different parameter types  
eg:
add(int a,int b)
add(double a,double b)
*/
class S
{
	void add()
	{
		int a=6,b=8;
		System.out.println(a+b);
	}
	int add(int a,int b)
	{
		//System.out.println(a+b);
		return a+b;
	}
	double add(double a,double b)
	{
		//System.out.println(a+b);
		return (a+b);
	}
}
class fnoverload1
{
public static void main(String[] args)
{
S obj=new S();
int su=obj.add(2,3);
double sum=obj.add(2.5,3.6);

System.out.println(su);
System.out.println(sum);
obj.add();
/*		or
System.out.println(obj.add(2,3));
System.out.print(obj.add(2.5,3.6));
*/
}}
