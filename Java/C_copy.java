/*
copy constructor
to copy the content from one constructor to another constructor
*/
class stu
{
int id;
String name;
stu(int i,String n)
{
id=i;name=n;
}
stu(stu ob)
{
	id=ob.id;name=ob.name;
}
void display()
{
System.out.println("id is ="+id);
System.out.println("name is = "+name);
}}
class C_copy
{
public static void main(String[] args)
{
stu obj=new stu(31,"KK");obj.display();
stu obj2=new stu(obj);obj2.display();
}}