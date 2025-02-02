import java.util.*;
class arms
{
public static void main(String ak[])
{
int n,s=0,c,r;
System.out.println("Enter no");
Scanner s1=new Scanner(System.in);
n=s1.nextInt();
c=n;
while(n>0)
{
r=n%10;
s=(r*r*r)+s;
n=n/10;
}
if(c==s)
System.out.println("Armstrong no");
else
System.out.println("Not Armstrong no");
}
}