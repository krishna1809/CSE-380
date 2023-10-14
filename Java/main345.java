class main123{
main123(int x)
{
System.out.println(x);
}}

class main345
{
main123 t=new main123(15);
main345(int i)
{
t=new main123(i);
}
public static void main(String args[])
{
main345 t2=new main345(5);
}
}