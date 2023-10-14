//jagged array

import java.util.Scanner;

class array444
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int[][] b=new int [3][];
int i,j;
b[0]=new int[3];
b[1]=new int[1];
b[2]=new int[2];

for(i=0;i<=2;i++)
{
	for(j=0;j<b[i].length;j++)
	{
		System.out.print("Enter row "+i+" and coulmn "+j+" :");
		b[i][j]=scan.nextInt();		//i+j;
	}
}
System.out.print("\n\tO/P\n");
for(i=0;i<=2;i++)
{
	for(j=0;j<b[i].length;j++)
	{
		System.out.print(b[i][j]+" ");
	}
	System.out.print("\n");
}
}}