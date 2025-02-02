import java.util.*;
class A
{
int l;
Scanner s=new Scanner(System.in);
void getl()
{
System.out.println("Enter l");
l=s.nextInt();
}
}
class B extends A
{
int b;
void getb()
{
System.out.println("Enter b");
b=s.nextInt();
}
void area()
{
System.out.println("Area="+(l*b));
}
public static void main(String ak[])
{
B obj=new B();
obj.getl();
obj.getb();
obj.area();
}
}