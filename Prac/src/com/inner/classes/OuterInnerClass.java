package com.inner.classes;

public class OuterInnerClass {

	int x = 30;
	static int y = 56;

	public  void mk() {
            int x = 300;
//            x = 34;
	 strictfp	class InnerCls {
//			int x = 33;
			public void dis() {
//				int x = 3312;
				System.out.println(x);
				System.out.println(y);
			}
		}
		  InnerCls cls = new InnerCls();
		  cls.dis();
	}
	
	public static void main(String[] args) {
		
		OuterInnerClass class1 = new OuterInnerClass();
		class1.mk();
	}
}
