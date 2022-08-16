import java.util.Scanner;

public class arrayClass {
public static void main(String[] args) {
	int a[]=new int[3];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 3 values");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	
}
}
