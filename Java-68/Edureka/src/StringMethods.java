
public class StringMethods {

	public static void main(String[] args) {
		String str = "edureka";
		System.out.println("Size of "+str+" = "+ str.length());
		
		System.out.println("Character @ index 0 = "+ str.charAt(0));
		
		System.out.println("Index of e = "+ str.indexOf("e"));
		
		System.out.println("Last Index of e = "+ str.lastIndexOf("e"));
		
		System.out.println(str.replace('e', '*'));
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str);
		
		String s1 = "   abc  def   ";
		System.out.println(s1.length());
		s1= s1.trim();
		System.out.println(s1.length());
	}
}
