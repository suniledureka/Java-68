package co.edureka;

public class WrapperTest {

	public static void main(String[] args) {
		Integer i1 = new Integer(25);
		Integer i2 = new Integer("25");
		Integer i3 = Integer.valueOf(25);
		Integer i4 = Integer.valueOf("25");
		System.out.println(i1+" | "+i2+" | "+i3+" | "+i4);
		
		System.out.println("-- getting primitive value fom object --");
		byte b = i1.byteValue();
		short s = i1.shortValue();
		int n = i1.intValue();
		long l = i1.longValue();
		float f = i1.floatValue();
		double d = i1.doubleValue();
		System.out.println(b+" | "+s+" | "+n+" | "+l+" | "+f+" | "+d);
		
		System.out.println("-- boxing & unboxing --");
		int n1 = 26;
		Integer n2 = n1; //boxing
		int n3 = n2; //unboxing
		System.out.println(n1+" | "+n2+" | "+n3);
		
		Integer x1 = Integer.valueOf(23);
		Integer x2 = Integer.valueOf(22);
		Integer x3 = x1 + x2;
		System.out.println(x3);
	}
}
