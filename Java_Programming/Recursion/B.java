class B 
{
	public static void main(String[] args) 
	{
		test(10);
	}

	public static void test(int i)
	{
		if(i == 0)
		{
			return;
		}
		i--;
		test(i);
		System.out.println("Hello World " + i);
	}
}
