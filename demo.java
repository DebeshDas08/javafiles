class dem
{
	int a,b;
	dem(int i,int j)
	{
	a=i;
	b=j;
	}
	void change(dem obj4)
	{
		obj4.a=21;
		obj4.b=25;
	}
}
class demo
{
	public static void main(String[] args)
	{
	dem obj=new dem(10,20);
	dem obj1=new dem(11,14);
	System.out.println("Before Call "+obj.a+" "+obj.b);
	obj1.change(obj);
	System.out.println("After Call "+obj.a+" "+obj.b);
	}
}