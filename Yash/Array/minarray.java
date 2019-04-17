import java.util.Scanner;
class minarray{
	public static void main(String[]args){
		int n ,min;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of  elements : ");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements of array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
min=a[0];
for(int i=0;i<n;i++)
{
	if(min > a[i])
	{
		min=a[i];
	}
}
System.out.println("minimum number is  " + min);
}
}