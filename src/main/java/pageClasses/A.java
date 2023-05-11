package pageClasses;


public class A {
	
	static int x=20;
	static int y=30;
	static int z=40;
	
	A()
	{
		x=200;
	}
	static void m1()
	{
		y=300;
	}
	static
	{
		z=400;
	}
	
	public static void main(String[] args)
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	
}

