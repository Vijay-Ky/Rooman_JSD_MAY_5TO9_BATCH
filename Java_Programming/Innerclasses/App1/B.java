interface A
{
	void method();
}
class B 
{
		
	public static void main(String[] args) 
	{
		A a1 = new A()
		{
			public void method()
			{
				System.out.println("from A.method");
			}
		};
		a1.method();
		System.out.println("Hello World!");
	}
}
