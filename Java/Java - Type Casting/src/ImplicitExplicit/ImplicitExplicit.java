package ImplicitExplicit;

public class ImplicitExplicit {
	public static void main(String[] args) {
		// implicit - Converting small primitive type to big data type
		byte b = 127;
		short a1 = b;
		int a2 = b;
		float a3 = b;
		double a4 = b;
		long a5 = b;

		System.out.println("Byte :" + b);
		System.out.println("Short :" + a1);
		System.out.println("int :" + a2);
		System.out.println("Float :" + a3);
		System.out.println("Double :" + a4);
		System.out.println("Long :" + a5);
		System.out.println();

		// explicit - Converting big data type to small data type
		double l = 12345.1;
		float b1 = (float) l;
		int b2 = (int) l;
		short b3 = (short) l;
		byte b4 = (byte) l;
		
		System.out.println("Double :"+ l);
		System.out.println("float :"+ b1);
		System.out.println("Int :"+ b2);
		System.out.println("Short :"+ b3);
		System.out.println("Byte :"+ b4);


	}
}
