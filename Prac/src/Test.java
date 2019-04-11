import java.util.ArrayList;

public class Test {

	int i;
	
	Test(int i )
	
	{
		this.i  = i;
	}
	
	public String toString()
	{
		return " "+i;
	}
	public static void main(String[] atrg)
	{
		
		
		
		ArrayList arrayList = new ArrayList<>();
		arrayList.add(2);
		arrayList.add("fdf");
		
		 System.out.println(new Test(2));
		
		
		System.out.println(arrayList);
		/*TreeSet  set = new TreeSet<>();
		set.add(2);
		set.add("dfd");*/
		
	}
}



