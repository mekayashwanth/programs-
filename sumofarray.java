public class sumofarray{
static int a[]={2,3,4,5,65};
static int sum()
{
int i=0;
int sum=0;
for(i=0;i<a.length;i++)
sum+= a[i];
return sum;
}
public static void main(String[] args ){
System.out.println("sum of array is : "+sum());
}
}
