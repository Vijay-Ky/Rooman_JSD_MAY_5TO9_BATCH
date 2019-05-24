class C
{
	C()
	{
		System.out.println("from C()");
	}
}
class D extends C
{
	D()
	{
		System.out.println("from D()");
		this(2);
	}
	D(int i)
	{
		System.out.println("from D()");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
