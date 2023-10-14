/*
Create a inventory management system where maxProductSize=10;
user will see menu of four option:
1. add product	->product name ,product price
2. display product
3. search product ->product name
4. exit

user can enter the product upto th value of 10 only
*/
import java.util.Scanner;

class maxProductSize
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int price[]=new int [10];
String name[]=new String [10];
int count=0;
int ch;

while(true)
{
/*
int exit=-1;
if(exit==0)
{
	break;
}*/
System.out.println("\t\tMenu");
System.out.println("1. Add product");
System.out.println("2. Display product");
System.out.println("3. Search product");
System.out.println("4. Exit");
System.out.println("Enter your choice:");
ch=Integer.parseInt(scan.nextLine());

 switch(ch)
 {
	case 1:
	{
		if(count<10)
		{
		System.out.println("Enter product name:");
		name[count]=scan.nextLine();
		System.out.println("Enter product price:");
		price[count]=Integer.parseInt(scan.nextLine());
		count++;
		System.out.println("Product Added");
		}
		else
		{
			System.out.println("You cannot add more product as max capacity is 10");
		}
		break;
	}
	case 2:
	{
		for(int i=0;i<count;i++)
		{
			System.out.println("Producy Details: "+i+"\n");
			System.out.println("product name: "+name[i]);
			System.out.println("product price: "+price[i]);
		}
		break;
	}
	case 3:
	{
		int x=-1;
		System.out.println("Enter product name you want to search: ");
		String sname=scan.nextLine();
		for(int i=0;i<count;i++)
		{
			
			if(sname.equals(name[i]))    //or s.equals(string comparing)   // name[i]==sname
			{
				System.out.println("Product name: "+name[i]);
				System.out.println("Product price: "+price[i]);
				x=0;
				break;
			}
		}
		if(x==-1)
		{
			System.out.println("Product name not found");
		}
		break;
	}
	case 4:
	{
		System.out.print("Exiting....");
		return;
	}
	default:
		{
		System.out.println("Invalid Choice");
		}
	}
}
}}