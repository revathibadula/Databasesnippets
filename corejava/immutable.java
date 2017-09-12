/*append concat*/
class immutable
{
public static void main(String args[])
{
String s1= new String ("Taj");
String s2= new String ("Mahal");
s1=s1.concat(s2);
System.out.println(s1);
StringBuffer sb1= new StringBuffer("Taj");
StringBuffer sb2= new StringBuffer("Mahal");
sb1=sb1.append(sb2);
System.out.println(sb1);
}
}
//doubt

