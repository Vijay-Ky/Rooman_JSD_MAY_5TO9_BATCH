class G 
{
	G(int i)
	{
		System.out.println("M(int)");
	}

	{
		System.out.println("M-IIB");
	}
	G(int i, int j)
	{
		this(j);
		System.out.println("M(int,int)");
	}
}
class H extends G
{
	H()
	{
		super(10,20);
		System.out.println("H()");
	}

	{
		System.out.println("H-IIB");
	}
	
	H(int i)
	{
		this();
		System.out.println("H(int)");
	}

	H(double i)
	{
		super(10);
		System.out.println("H(double)");
	}

	public static void main(String[] args) 
	{
		G g1 = new G(10);
		System.out.println("---------------");
		G g2 = new G(20,4);
		System.out.println("---------------");
		H h1 = new H();
		System.out.println("----------------");
		H h2 = new H(10);
		System.out.println("-------------");
		H h3 = new H(1.0);
		System.out.println("--------------");
	}		
}
