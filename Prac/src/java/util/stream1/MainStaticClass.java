package java.util.stream1;

public class MainStaticClass {
	
	public static void main(String[] args) {
		
		Employee<String> mk = StaticCheck.<String>mk();
		System.out.println(mk);
		
	}

}
