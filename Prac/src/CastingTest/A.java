package CastingTest;

public class A implements C {

	public void close()
	{
		System.out.println("close in A");
	}
}


class B extends A
{
	public void close()
	{
		System.out.println("close in B");
	}
}

class Main
{
	public static void main(String[] args)
	{
		A a = new A();
		((C)a).close();
	}
}

interface C
{
	void close();
}