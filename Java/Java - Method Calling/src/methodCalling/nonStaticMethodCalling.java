package methodCalling;

public class nonStaticMethodCalling {
void addNum(int a,int b) {
	int result=a+b;
	System.out.println(result);

}
public static void main(String[] args) {
	nonStaticMethodCalling m=new nonStaticMethodCalling();
	m.addNum(20, 30);
}
}
