/* declare a class employee
take two variable empid and empname from userff through member functions,
with class concept, call member fn(print()) to print both variables
 using annonymous object
*/
import java.util.Scanner;
class A
{
int empid;
String ename;
void getdata()
{
Scanner obj= new Scanner (System.in);
System.out.print("enter any empid=");
empid=obj.nextInt();
System.out.print("enter emp name=");ename=obj.next();
}
void print()
{
System.out.println("empid is = "+empid);System.out.println("emp name is = "+ename);
}}

class employee123
{
public static void main(String[] args)
{
//A obj=new A();
new A().getdata();
new A().print();
}}
