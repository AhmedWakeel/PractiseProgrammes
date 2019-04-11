import static java.nio.charset.StandardCharsets.*;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class SymbolCheck {

	public static void main(String[] args) throws UnsupportedEncodingException
	{
		
		  Charset UTF_8 = Charset.forName("UTF-8");
		  Charset ISO = Charset.forName("ISO-8859-1");
		
		  String textwithaccent="“";
		  String textwithletter="’";

		String  text1 = new String(textwithaccent.getBytes(ISO), UTF_8);
		String  text2 = new String(textwithletter.getBytes(ISO),UTF_8);
		
		System.out.println(text1);
		System.out.println(text2);
		
		/*String str =   "”"; //"Ã¢ÂÂ AA Ã¢ÂÂ Ã¢ÂÂ WW Ã¢ÂÂ";
		
		byte[] bytes = str.getBytes("ISO-8859-1");
		String string = new String(bytes, UTF_8);
		
		System.out.println(string.replaceAll("\\?", "\""));
		
		
		
		String str11 = "“";
		byte[] bytes1 = str11.getBytes("ISO-8859-1");
		String string1 = new String(bytes1, UTF_8);
		System.out.println(string1);
		System.out.println(string1.replaceAll("\\?", "\""));*/
		
		/*String str22 = "â€˜";
		byte[] bytes2 = str22.getBytes("ISO-8859-1");
		String string2 = new String(bytes2, UTF_8);
		System.out.println(string2);
		System.out.println(string2.replaceAll("\\?", "\""));
		
		
		String str23 = "â€™";
		System.out.println(str23);
		byte[] bytes23 = str23.getBytes("ISO-8859-1");
		String string23 = new String(bytes23, UTF_8);
		System.out.println(string23);
		System.out.println(string23.replaceAll("\\?", "\""));
		*/
		
		
		/*String str="or";      

		str=str.replace("\"", "\\\"");
		System.out.println(str);*/
		
		/*String s1 = "â€˜";
		String s2 = "â€™";
		String s3 = "â€œ";
		String s4 = "â€";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println("\"".equals("“"));*/
		
		
		
		
		
		
		/*char c1 = '‘';
		String s = "â€˜";  //  ‘ â??
		String s1 = "â€™";  //  ’ â??  
		String s2 = "â€œ";  // “ â??  
		String s3 = "â€";

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println("â??".equals("â??"));*/
	}
}
