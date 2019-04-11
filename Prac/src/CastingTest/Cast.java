package CastingTest;

 
class Cast1
{
	
}

class Cast2 extends Cast1
{
	
}

class MainCast
{
	public static void main(String[] args)
	{
			Cast1 cast1 = new Cast2();
			Cast1 cast12 = (Cast1)cast1; 
			System.out.println(cast12.getClass().getName());
//			System.out.println(cast1.getClass().getName());
	}
}