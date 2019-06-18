/*
Method Local inner classes:
Inner class can be declared within a method of an outer class.
In the following example, Inner is an inner class in outerMethod().*/

class Outer
{ 
	void outerMethod()
	{ 
		System.out.println("inside outerMethod"); 
		// Inner class is local to outerMethod() 
		class Inner
		{ 
			void innerMethod()
			{ 
				System.out.println("inside innerMethod"); 
			} 
		} 
		Inner y = new Inner(); 
		y.innerMethod(); 
	} 
} 
class MethodDemo
{ 
	public static void main(String[] args)
	{ 
		Outer x = new Outer(); 
		x.outerMethod(); 
	} 
} 
