package com.method;

public class InterfImp implements Interf,Interf2 {

	public static void main(String[] args) {
		
		InterfImp imp = new InterfImp();
//		new InterfImp().defaultCall();
		imp.mk("malik");	}

	public void defaultCall() {
		mk("malik");
	}

	@Override
	public  void mk(String name) {
		Interf.super.mk(name);
		Interf2.super.mk(name);

	}
}
