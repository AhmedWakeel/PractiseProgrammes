package java.util.stream1;

public class StaticCheck {
	
	public static<T>  Employee<T>  mk()
	{
		 Employee employee = new Employee();
		 employee.setId(10);
		 employee.setName("malik");
		
		return employee;
	}

}
