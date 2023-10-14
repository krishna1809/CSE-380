import java.util.Scanner;
interface A
{
	
	static void area_cube()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter side: ");
		int a=scan.nextInt();
		//int a=5;
		int ar=a*a*a;
		System.out.println("area of cube: "+ar);
	}
	
}
class interface_cubearea
{
public static void main(String[] args)
{
A.area_cube();
}
}