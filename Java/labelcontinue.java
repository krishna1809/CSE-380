// finding odd or even using continue statement

class labelcontinue
{
public static void main(String args[])
{
int i;
first:
for(i=0;i<3;i++)
{
	second:
	for(int j=0;j<3;j++)
	{
		if(i==1 && j==1)
		{
			continue first;
		}
		System.out.println(i+" "+j);
	}
	
	
}
}}