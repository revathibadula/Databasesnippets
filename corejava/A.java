import java.io.IOException;

public class A {
	void m1()throws IOException
	{
	}
	void m2()throws IOException
	{
	}
 public static void main(String[] args) {
		// TODO Auto-generated method stub
	 try
	 {
		 A a = new A();
		 a.m1();
		 a.m2();
	 }catch(IOException ie)
	 {
	 System.out.println(ie);
	 }
	}

}
