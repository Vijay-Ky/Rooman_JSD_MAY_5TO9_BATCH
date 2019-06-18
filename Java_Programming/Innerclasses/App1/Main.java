/*
Inner class means one class which is a member of another class. There are basically four types of inner classes in java.
1) Nested Inner class
2) Method Local inner classes
3) Anonymous inner classes
4) Static nested classes

class University
{
	class Department
	{
	}
}

class Car
{
	class Engine
	{
	}
}
Nested Inner class: can access any private instance variable of outer class.
Like any other instance variable, we can have access modifier private, protected, public and 
default modifier.Like class, interface can also be nested and can have access specifiers.*/

class Outer
{ 
// Simple nested inner class 
	class Inner
	{ 
		public void show()
		{ 
			System.out.println("In a nested class method"); 
		}	 
	}	 
} 
class Main
{ 
	public static void main(String[] args)
	{ 
		Outer.Inner in = new Outer().new Inner(); 
		in.show(); 
	}	 
} 






















