
public class Test44 {

	public static void main(String[] args)
	{
		A a = new A();
		a.m1(null);
		
//		int b = 5;
//		byte c = b;
		 int i  = 4;
//		byte b = i+3;
		
	}
}

class A
{
  public void m1(Integer integer)
  {
	  System.out.println("integer");
  }
  public void m1(Object obj)
  {
	  System.out.println("object");
  }	
	
}


class B
{
	
}