package Methodoverloading;

public class Sample5 

{
	private int id = 10;
	private String hit = "java";
	
	public void fun1()
	{
		System.out.println("its method overloading concept");
	}
public void fun1(int id)
{
	System.out.println(id);
	
}
	public void fun1(int i, String hit)
	
	{
		int k=id+i;
		System.out.println(k);
		System.out.println(hit);
	}
}

