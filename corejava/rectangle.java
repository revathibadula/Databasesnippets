/* abstraction */
abstract class shape
{
abstract void getArea();
}
class  Triangle extends shape
{
void getArea()
{
System.out.println("1/2 * b * h");
}
}
class circle  extends Triangle
{
void getArea()
{
System.out.println("Area of the circle");
}
}
class rectangle extends circle
{
void getArea()
{
System.out.println("Area of rectangle");
}
public static void main(String args[])
{
//Traingle t = new Triangle();
//t.getArea();
circle c = new circle();
c.getArea();
rectangle r = new rectangle();
r.getArea();
}
}



