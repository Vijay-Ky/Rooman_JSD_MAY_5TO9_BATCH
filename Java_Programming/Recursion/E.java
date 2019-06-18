public class E
{   
	static void p(int i)
	{  
		System.out.println("hello "+ i); 
		if(i == 0)
		{  
			return;
		}  
		i--; 
		p(i);
		System.out.println("hello "+ i);
	}  
	public static void main(String[] args)
	{  
		p(5);  
	}  
}  