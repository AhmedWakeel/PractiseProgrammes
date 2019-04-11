package com.inner.classes;

public class InterfaceInsideClass {

	interface InnerInterface
	{
		class In
		{
			
		}
		public void mk();
	}
	class InnerImpClass implements InnerInterface
	{

		@Override
		public void mk() {
			
		}
		
	}
}

class Impp extends InterfaceInsideClass.InnerInterface.In
{

	public void mk() {
		
	}
	
}
