package CastingTest;

public class MM {

	public void m(String s) {
		if ("hi".equals(s))
			System.out.println("yes");

		if (s.equals("hi"))
			System.out.println("no");
	}

	public static void main(String[] args) {
		MM mm = new MM();
		mm.m(null);
	}
}
