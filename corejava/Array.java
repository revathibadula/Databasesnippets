
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try
			{
				int a = Integer.parseInt(args[0]);
				int b = Integer.parseInt(args[1]);
				int c=a/b;
				System.out.println(c);
				}catch(ArrayIndexOutOfBoundsException e)
			//catch block
		{
					System.err.println("please pass 2 integers");
					}catch(ArithmeticException ae)
			{
			System.out.println("Got arithematic exception"+ae.getMessage());
			}

	}

}
// Arithematic exception