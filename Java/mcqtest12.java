/*

class mcqtest12
{
static int i=1;
static int j=2'
int x=3,y=5;
class Inner
{
int l=8;
static void sum()
{
System.out.println(i+j+x+y+l);
}}
public static void main(String args[])
{
mcqtest12 t2= mew mcqtest12(sum);
}
}

*/

class mcqtest12
{
static int i=1;
static int j=2;
static int x=3,y=5;
static class Inner
{
static int l=8;
static void sum()
{
System.out.println(i+j+x+y+l);
}}
public static void main(String args[])
{
mcqtest12.Inner t2= new mcqtest12.Inner();
t2.sum();
}
}
