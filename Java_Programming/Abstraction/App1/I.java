abstract class A
{
	abstract void test1();
	void test2()
	{
		System.out.println("from test2");
	}
}
class G extends A
{
	void test1()
	{
		System.out.println("from test1");
	}
}
class I
{
	public static void main(String[] args)
	{
		G g1 = new G();
		g1.test1();
		g1.test2();
		System.out.println("done");
	}
}