//declare the two variables-> input from user
//whenever user press =>'+',it will add two numbers
// '-' ->it will subtract two number ,'*'-> do multiply,'/' perform division

import java.util.Scanner;

class switchoperator
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
int a,b,add,sub,mul,div;
char op;
System.out.println("Enter value of 'a':");a=obj.nextInt();
System.out.println("Enter value of 'b':");b=obj.nextInt();
System.out.println("1.press'+' for addition");
System.out.println("2.press'-' for subtraction");
System.out.println("3.press'/' for division");
System.out.println("4.press'*' for multiplication");
System.out.println("now press your input:");
op=obj.next().charAt(0);
add=a+b;
sub=a-b;
mul=a*b;
div=a/b;
switch(op)
{
case '+':
System.out.println("The addition is:"+ add);break;
case '-':
System.out.println("The subtraction is:"+ sub);break;
case '*':
System.out.println("The multiplication is:"+ mul);break;
case '/':
System.out.println("The division is:"+ div);break;
default:
System.out.println("Invaild option");
}}}