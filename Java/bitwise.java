//bitwise operator
//&,|,^,<<m>>
//bitwise and,or,XOR,left shift,right shift

class bitwise
{
public static void main(String[] args)
{
int a=2,b=5;
System.out.println(a&b);//0
System.out.println(a|b);//7
System.out.println(a^b);//7
//left shift->delete n(bit) from left and add zero to right
System.out.println(a<<1);//4
System.out.println(a<<2);//8
//right shift->delete n(bit) from right and add zero to left
System.out.println(a>>1);//1
System.out.println(a>>2);//0
}}