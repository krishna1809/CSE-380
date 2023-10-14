/*
abstraction -> hiding property from users
1. abstract class
2. Interfaces

Abstract class
1. class must be started with abstract keyword
2. It can store abstract method and non-abstract method
3. not able to create object
4. can contain constructors, static method also
5. can contain final method also
*/

abstract class Abstract
{
	abstract void add();
	{
	
	}
	void sub()
	{

	}
}
class B extends Abstract
{
	void add()
	{
	
	}
}