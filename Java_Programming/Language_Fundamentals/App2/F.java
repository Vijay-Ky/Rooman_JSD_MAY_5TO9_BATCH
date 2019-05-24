class E
{
	E()
	{
		System.out.println("from E()");
	}
}
class F extends E
{
	F()
	{
		super();
		this(2);
		System.out.println("from F()");
	}
	F(int i)
	{
		System.out.println("from F()");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
