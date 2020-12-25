class Test
{
	
	private int data;
	
	
	void get()
	{
		return data;
	}
	
	void set(int d)
	{
		this.data=d;
	}
	
	public String toString()
	{
		return "test";
	}
	public static void main(String args[])
	{
		String s = new String("Nilesh");
		System.out.println(s);
		
		Integer i = new Integer(101);
		System.out.println(i);
		
		Test t = new Test();
		System.out.println(t);
		
		System.out.println("Omkar Amin here !");
		
		
	}
}
