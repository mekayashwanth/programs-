class minarray{
static int b[]={34,3,1,42,27};
static int smallest()
{
int i;
int min=b[0];
for(i=1;i<b.length;i++)
if(b[i]<min)
min=b[i];
return min;
}
public static void main(String[] args){
System.out.println("minimum number in array is : "+ smallest());
}
}