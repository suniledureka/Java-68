
public class SBTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb+" |Size="+sb.length()+" |Capacity="+sb.capacity());
		
		sb.append("edureka limited");
		System.out.println(sb+" |Size="+sb.length()+" |Capacity="+sb.capacity());
		
		sb.append(" B");
		System.out.println(sb+" |Size="+sb.length()+" |Capacity="+sb.capacity());
	}
}
