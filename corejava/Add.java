/* method overloading */
public class Add
{
public void add(int a,int b)
{
	int c=a+b;
	System.out.println(c);
	}
	public void add(int a,int b,int c)
	{
	int d=a+b+c;
	System.out.println(d);
	}
	public static void main(String args[])
	{
	Add a= new Add();
	a.add(2,3);
	a.add(2,3,5);
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	