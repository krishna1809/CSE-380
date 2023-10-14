// aggregation -> one class acessing another another class using objects
// has-a relationship

class Address 
{
String city,state,country;
Address(String city,String state,String country)
{
	this.city=city;this.state=state;this.country=country;
}
}
class student
{
	int rollno;String name;
	Address obj;
	student(int rollno,String name,Address obj)
	{
		this.rollno=rollno;this.name=name;this.obj=obj;
	}
void show()
{
	System.out.println("rollno is:"+rollno);
	System.out.println("name is:"+name);
	System.out.println("city is:"+obj.city);
	System.out.println("state is:"+obj.state);
	System.out.println("country is:"+obj.country);

}
}
class Aggreg1
{
public static void main(String[] args)
{
Address obj1=new Address("jala","punjab","INDIA");
student obj2=new student(10,"AA",obj1);
obj2.show();
}}