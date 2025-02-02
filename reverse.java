import java.util.*;
class reverse
{
public static void main(String ak[])
{
int n,r;
System.out.println("Enter no");
Scanner s=new Scanner(System.in);
n=s.nextInt();

while(n>0)
{
r=n%10;
n=n/10;
System.out.println(r);
}
}
}