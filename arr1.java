class arr1
{
public static void main(String ak[])
{
int a[]={1,2,3,4,5,6,7,8,9,10},i,sum=0;
for(i=0;i<a.length;i++)
{
System.out.println(a[i]+"\t");
if(a[i]%2==0)
sum=sum+a[i];
}
System.out.println("\n Smof evens="+sum);
}
}