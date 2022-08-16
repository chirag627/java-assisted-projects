import java.util.Scanner;

public class tryCatch {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	try {
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println(a/b);
	}
	catch(ArithmeticException e) {
		System.out.println("You cannot devide the number by 0");
	}
	
}
}
