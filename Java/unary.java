//unary operator
//post increment a++		post decrement	a--:assign, increment
//pre increment	a++		pre decrement	--a :decrement/increment, assign
class unary
{
public static void main(String[] args)
{
int a=10,b,c,d,e;
b=++a;//a=11,b==11
System.out.println("pre increment answer");
System.out.println("a value is=" +a);//11
System.out.println("b value is=" +b);//11

c=a++;//c=11,a=12
System.out.println("post increment answer");
System.out.println("a value is=" +a);//12
System.out.println("c value is=" +c);//11
d=--a;//d=11,a=11
System.out.println("pre decrement answer");
System.out.println("a value is=" +a);//11
System.out.println("b value is=" +d);//11

e=a--;//c=11,a=10
System.out.println("post decrement answer");
System.out.println("a value is=" +a);//10
System.out.println("c value is=" +e);//11
}}