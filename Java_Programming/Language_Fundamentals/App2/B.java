class A
{
	A()
	{
		System.out.println("from A()");
	}
}
class B extends A
{
	B()
	{
		System.out.println("from B()");
		super();
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
