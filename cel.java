import java.util.*;
class cel
{
public static void main(String ak[])
{
float temp;
Scanner s=new Scanner(System.in);
System.out.println("Enter temp in fahrenheit");
temp=s.nextInt();
temp=((temp-32)*5)/9;
System.out.println("Enter temp in celsius="+temp);
}
}