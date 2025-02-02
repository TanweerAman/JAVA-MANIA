import java.util.*;
class prime
{
public static void main(String ak[])
{
Scanner sc=new Scanner(System.in);
int n,f=0;
System.out.println("enter no");
n=sc.nextInt();
for(int i=1;i<=n;i++){
if(n%i==0)
f++;
}
if(f==2)
System.out.println("prime");
else
System.out.println("not prime");
}
}
