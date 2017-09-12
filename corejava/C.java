/* Method Overriding */
 class D
{
	void show()
{
		System.out.println("D class");
	}
}
public class C extends D
{
	void show()
{
	System.out.println("C class");
}
public static void main(String args[])
{
C c =new C();
c.show();
}
}

