class maxarray{
static int a[]={23,34,12,65,34};
static int largest()
{
int i;
int max=a[0];
for(i=1;i<a.length;i++)
if(a[i]>max)
max=a[i];
return max;
}
public static void main(String[]args){
System.out.println("max number in array is : "+ largest());
}
}
