abstract class A
{
	abstract void test1();
	void test2()
	{
		System.out.println("from A.test2");
	}
	abstract void test3();
}
abstract class B extends A
{
	void test1()
	{
		System.out.println("from B.test1");
	}
}
class J extends B
{
	void test3()
	{
		System.out.println("from C.test1");
	}
	public static void main(String[] args) 
	{
		//A a1 = new A();
		//B b1 = new B();
		J obj = new J();
		obj.test1();
		obj.test2();
		obj.test3();
		System.out.println("done");
	}
}
