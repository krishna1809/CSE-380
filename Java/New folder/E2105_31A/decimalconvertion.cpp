#include<iostream>
using namespace std;

int main()
{
	int num;
	cout<<"Enter a number:";
	cin>>num;
	
	int temp;
	char hex[50];
	int i=0;
	
	while(num!=0)
	{
		temp=num%16;
		if(temp<10)
		{
			hex[i]=temp+48;
		}
		else
		{
			hex[i]=temp+55;
		}
		num=num/16;
		i++;
	}
	
	cout<<"The hexadecimal is: ";
	for(int k=i-1;k>=0;k--)
	{
		cout<<hex[k];
	}
	return 0;
}
