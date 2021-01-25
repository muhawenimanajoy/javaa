class AssignmentOperator
{
	public static void main(String []args)
	{
		int a=5;
		int b=2;
        b=b+a;
		System.out.println(b);//2
		System.out.println(b+=a);//12
		System.out.println(b=a);//5
	}
}