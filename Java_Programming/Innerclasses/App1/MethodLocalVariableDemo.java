class Outer
{ 
	void outerMethod()
	{ 
		final int x = 98; 
		System.out.println("inside outerMethod"); 
		class Inner
		{ 
			void innerMethod()
			{ 
				System.out.println("x= "+x); 
			}	 
		}	 
		Inner y = new Inner(); 
		y.innerMethod(); 
	} 
} 
class MethodLocalVariableDemo
{ 
	public static void main(String[] args)
	{ 
		Outer x = new Outer(); 
		x.outerMethod(); 
	} 
}
/*
Note : Local inner class cannot access non-final local variable till JDK 1.7.
Since JDK 1.8, it is possible to access the non-final local variable in
method local inner class.*/