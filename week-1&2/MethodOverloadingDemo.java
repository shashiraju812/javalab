class MethodOverloadingDemo 
{
	float sum(float a,float b)
	{
		return a+b;
	}
	double sum(double a,double b,double c)
	{
		return a+b+c;
	}
	public static void main(String[] args) 
	{
		MethodOverloadingDemo obj=new MethodOverloadingDemo();
		System.out.println("sum of the 2 number"+obj.sum(10,20));
		System.out.println("sum of the 3 number"+obj.sum(10,20,30));
	}
}
