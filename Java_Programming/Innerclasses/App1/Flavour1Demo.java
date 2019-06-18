/*
Anonymous inner classes
Anonymous inner classes are declared without any name at all. They are created in two ways.
a) As subclass of specified type
b) As implementer of the specified interface
*/
class Demo
{ 
	void show()
	{ 
		System.out.println("i am in show method of super class"); 
	} 
} 
class Flavor1Demo
{ 
// An anonymous class with Demo as base class 
	static Demo d = new Demo()
	{ 
		void show()
		{ 
			super.show(); 
			System.out.println("i am in Flavor1Demo class"); 
		} 
	}; 
	public static void main(String[] args)
	{ 
		d.show(); 
	} 
}

