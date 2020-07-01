package access_specifier;

public class Class1 
{
	static int a = 10;
	String b = "madan";
	public static void abcd() 
	{
	System.out.println(a);	
	}
	public void abc() 
	{
		System.out.println(b);
	}

	public void abcd4() 
	{
		System.out.println("its non static method");
		abcd();
		abc();
		
	}
	public static void main(String[] args) 
	{
		Class1 e = new Class1();
		e.abcd4();
		e.abc();
		System.out.println("name = "+e.b);
		// TODO Auto-generated method stub

	}

}
