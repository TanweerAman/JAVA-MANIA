import java.util.*;
class fact
{
public static void main(String ak[])
{
int n,c,f=1;
System.out.println("enter a no");
Scanner s=new Scanner(System.in);
n=s.nextInt();
if(n<0)
System.out.println("Number cannot be negative ");
else
{
for(c=1;c<=n;c++)
f=f*c;
System.out.println("fact="+f);
}
}
}