/*number to string*/
class Number
{
public static void main(String args[])
{
byte b[]={97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121};
String s1=new String(b);
System.out.println(s1);
String s2=new String(b,2,2);
System.out.println(s2);
}
}
