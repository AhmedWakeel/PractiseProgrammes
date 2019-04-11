package com.clascastexception;

public class CastingException {
 
	
	    public static void main(String[] args)
	    {
//	    	P m = new C(); 
	        A a = new B();   //B type is auto up casted to A type
	        N b = (M) a;     //A type is explicitly down casted to B type.
//	        P c = (N) b;    //Here, you will get class cast exception
//	        System.out.println(c.k);
	}
}
class A
{
    int i = 10;
}
 
class B extends A implements M
{
    int j = 20;
}
 
class C extends B implements P
{
    int k = 30;
}
interface M extends N,P
{
	
}
interface N extends P
{
	
}
interface P
{
	
}