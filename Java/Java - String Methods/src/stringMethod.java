
public class stringMethod {
public static void main(String[] args) {
	//String Methods
	String s="Learning Java";
	
	//Char at the index
	System.out.println(s.charAt(0));
	//returns the char Unicode at index
	System.out.println(s.codePointAt(0));
	//returns the unicode of char before index
	System.out.println(s.codePointBefore(1));
	//Compare String on the basis of unicode
	System.out.println(s.compareTo("Learning C#"));
	//Compare String on the basis of unicode and ignores case	
	System.out.println(s.compareToIgnoreCase("LEARNING JAVA"));
	//substring
	System.out.println(s.substring(4));
	//check if string is empty
	System.out.println(s.isEmpty());
	//converts to lowercase
	System.out.println(s.toLowerCase());
    //replace a character
	System.out.println(s.replace('J','Z'));
	///checks equality
	System.out.println(s.equals("Learn java"));
	
	//String Buffer
	StringBuffer b= new StringBuffer("Learn Java");
	//append 
	System.out.println(b.append(", Learn C#"));
	//Insert at index
	System.out.println(b.insert(0, "Learn PHP,"));
	//string replacement
	System.out.println(b.replace(0, 3, "s"));
    //reverse
	System.out.println(b.reverse());
	//delete
	System.out.println(b.delete(0, 3));
	
	//String Builder
	StringBuilder c= new StringBuilder("Java");
	System.out.println(c.append(" learn and practice "));
	System.out.println(c.insert(4, ", c#"));
	System.out.println(c.replace(0, 4, "PHP"));
	System.out.println(c.reverse());
	System.out.println(c.delete(0,8));
	
	
	//coverting Str to String Buffer
	String str="java";
	StringBuffer b1=new StringBuffer(str);
	System.out.println(b1.reverse());
	
	//converting str to StringBuilder
	StringBuilder b2=new StringBuilder(str);
	System.out.println(b2.reverse());
	
}
}
