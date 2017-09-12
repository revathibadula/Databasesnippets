import java.io.IOException;

/**
 * 
 */

/**
 * @author revathibadula
 *
 */
public class N {
void m1() throws IOException
{
throw new IOException();
}
void m2()throws IOException
{
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	N n = new N();
	n.m1();
	n.m2();
}catch(IOException ie)
//catch
{
System.out.println(ie);
	}

}
}
//output not understanding