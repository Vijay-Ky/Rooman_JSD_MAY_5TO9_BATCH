class I
{
	public static void main (String[] args)
	{
		System.out.println("main begin");
		test(3);
		System.out.println("main end");
	}
	public static void test(int i)
	{
		System.out.println("test begin:" + i);
		if(i == 0)
		{
			return;
		}
		i--;
		test(i);
		System.out.println("test end:" + i);
	}
}