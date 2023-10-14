//two -dimensional array

import java.util.Scanner;

class array321
{
public static void main(String[] args)
{
//int a[] = new int[5];   //1-D array
Scanner scan=new Scanner(System.in);
int[][] b=new int [3][3];
int i,j;
for(i=0;i<=2;i++)
{
	for(j=0;j<=2;j++)
	{
		System.out.print("Enter row "+i+" and coulmn "+j+" :");
		b[i][j]=scan.nextInt();		//i+j;
	}
}
for(i=0;i<=2;i++)
{
	for(j=0;j<=2;j++)
	{
		System.out.print(b[i][j]+" ");
	}
	System.out.print("\n");
}
}}