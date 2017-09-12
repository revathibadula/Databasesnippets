/* downcasting */
class F
{
void print()
{
	System.out.println("F class");

}

void show()
{
}
}
public class E extends F
{
void show()
{
	System.out.println("E class");
	
}
void display()
{
}
public static void main(String args[])
{
F f= new E();
f.show();
f.print();
}
}