package com.generic.interfaces; 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MainFunctionInterface {

	public static void main(String[] args) {

		
		Employee employee1 = new Employee(20, "ab");
		Employee employee2 = new Employee(120, "abc");
		Employee employee3 = new Employee(30, "abww");
		
		/*List<Employee> asList = Arrays.asList(employee1,employee2,employee3);
        for(Employee employee : asList)
        {
        	String call = employee.call(s -> s.getName()+" "+s.getId());
        	System.out.println(call);
        }*/
	
	/*	List<Employee> asList = Arrays.asList(employee1,employee2,employee3);
        asList.forEach(x ->{
        	                 String call = x.call(s -> s.getId()+" "+s.getName());
//        	                 System.out.println(call);
                           }
        );*/
		
/*		List<Employee> asList = Arrays.asList(employee1,employee2,employee3);
		 asList.forEach(x ->
		                      {
			                    String call = x.call(
					                    new Function<Employee, String>()
				          	            {
					                      @Override
						                  public String apply(Employee e)
						                  {
							               return e.getName()+" "+e.getId(); 
						                  }
					                    }
				                      );
			           		 System.out.println(call);

		                     }
		               );*/
		
		/*List<Employee> asList = Arrays.asList(employee1,employee2,employee3);
		asList.forEach(System.out::println);
		*/
		
	/*	List<Employee> asList = Arrays.asList(employee1,employee2,employee3);
		asList.forEach(
				          x -> 
				          {
				        	  String call = x.call(
				        			   new Function<Employee, String>() 
				        			   {
				        				   @Override
				        				   public String apply(Employee e)
				        				   {
				        					   return e.getName()+" "+e.getId();
				        				   }
				        				   
									   }
				        			);
				        	  System.out.println(call);
				          }
				     );
		*/
		
		List<Employee> asList = Arrays.asList(employee1,employee2,employee3);
		Function<Employee, String> function = x -> x.getName()+"-"+x.getId();
		
		asList.forEach(s ->
		{
			 s.call(function);	
		}
		);
		
		
		
		
		
		
		
		
	}
}
