/*constructor
1.same name as of class
2.no return type
3.called automATICAlly without creation of object

area of rectangle
*/


/*
//program 1:

class A
{
int l,b,area;
A()
{
l=5;b=6;
area=l*b;
System.out.println(area);
}}
class area123
{
public static void main(String[] args)
{
A obj=new A();
}}
*/
/*
//program 2:

class A
{
int l,b,area;
A()
{
l=5;b=6;


}
void area(){
	area=l*b;System.out.println(area);
}
}
class area123
{
public static void main(String[] args)
{
A obj=new A();	//calling of constructordone automatically
obj.area();     //memeber function need to be called using dot operator
}}
*/

//program 3: ->parametrized constructor
class A
{
int len,bre,area;
A(int l,int b)
{
len=l;bre=b;


}
void area(){
	area=len*bre;System.out.println(area);
}
}
class area123
{
public static void main(String[] args)
{
A obj=new A(5,6);	//calling of constructordone automatically
obj.area();     //memeber function need to be called using dot operator
}}
