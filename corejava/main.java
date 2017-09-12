class person
{
private int age;
public void setAge(int age)
{
if(age>100)
this.age=100;
else
if(age<100)
this.age=age;
}
int getAge()
{
return age;
}
}
class main
{
public static void main(String args[])
{
person p=new person();
p.setAge(20);
System.out.println(" Age : " + p.getAge());
}
}