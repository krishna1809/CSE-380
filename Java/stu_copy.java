/*
without a copy constructor
to copy the content from one constructor to another constructor
*/
class stu_copy
{
int id;
String name;
stu_copy(int i,String n)
{
id=i;name=n;
}
stu_copy()
{
	
}
void display()
{
System.out.println("id is ="+id);
System.out.println("name is = "+name);
}
public static void main(String[] args)
{
stu_copy obj=new stu_copy(31,"KK");obj.display();
stu_copy obj1=new stu_copy();
obj1.id=obj.id;
obj1.name=obj.name;
obj1.display();
}}