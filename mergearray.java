class mergearray{
public static void main (String[] args){
int[] a ={3,5,4,6};
int[] b ={7,8,9,10};
int[] c= new int[a.length+b.length];
int count=0;
for(int i=0;i<a.length;i++)
{
c[i]=a[i];
count++;
}
for(int j=0;j<b.length;j++){
c[count++]=b[j];
}
for(int i=0;i<c.length;i++)
System.out.print(c[i]+" ");
}
}

