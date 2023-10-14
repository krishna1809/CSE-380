/*
String on java

String is immutable -> cannot change
*/

class JString12
{
public static void main(String[] args)
{
String s="HELLO";
char s1[]={'h','e','l','l','o'};
String s2=new String(s1);

s.concat("STUDENT");
System.out.println(s);		//HELLO

s=s.concat("STUDENTS");
System.out.println(s);		//HELLOSTUDENTS

System.out.println(s2);

//String comparsion functions
//1.equals()	->true/false
System.out.println("\n1. String comparsion functions:.equals() and .equalsIgnoreCase()\n");
String s3="HELLO";
String s4="hello";
String s5="HELLO";

System.out.println(s3.equals(s4));	//false
System.out.println(s3.equals(s5));	//true
System.out.println(s3.equalsIgnoreCase(s4));	//true

//2. ==operator->true and false
System.out.println("\n2. == operator->true and false\n");
System.out.println(s3==s4);	//false
System.out.println(s3==s5);	//true

//3. compareTo()	->0(both are equal)/1  [  positive(s1>s2) and negative(s1<s2)]
System.out.println("\n3. compareTo()	->0(both are equal)/1  [  positive(s1>s2) and negative(s1<s2)]\n");
System.out.println(s3.compareTo(s4)); //negative
System.out.println(s3.compareTo(s5)); //0
System.out.println(s4.compareTo(s3)); //positive

//concatenation method for string
String s11="hello ";String s12="Students";String s13;
System.out.println("1st method");
System.out.println(s11+s12);	//hello Students

System.out.println("2nd method");
s13=s11.concat(s12);
System.out.println(s13);	//hello Students

System.out.println("3rd method");
String s14=String.join("",s11,s12);	
System.out.println(s14);	//hello Students

//substring
System.out.println("\nsubstring");
String s15="HELLO STUDENTS";
System.out.println(s15.substring(0,6));	//HELLO
System.out.println(s15.substring(0,7));	//HELLO
System.out.println(s15.substring(1,6));	//ELLO

//toUpperCase() and toLowerCase()
System.out.println("\ntoUpperCase() and toLowerCase()");	
System.out.println(s14.toUpperCase());	//HELLO
System.out.println(s15.toLowerCase());	//hello students

//trim->delete white space before and after the string 
System.out.println("\ntrim()");
System.out.println(s15.trim());	//HELLO STUDENTS
String s16="    hello    students";
System.out.println("before:"+s16+"\nafter:"+s16.trim());	//hello students

//charAt()
System.out.println("\ncharAt()");
System.out.println(s15.charAt(0));	//HELLO

//length()
System.out.println("\nlength()");
System.out.println(s15.length());	//14

//replace
System.out.println("\nreplace()");
System.out.println(s15.replace("HELLO","HI"));	//HI STUDENTS

}
}