package DemoModule;

public class MethodOverloading1 {
	void show()
	{
		System.out.println("1");
	}
	void show(int a, int b)
	{
		System.out.println("2");
	}

	public static void main(String[] args) {
		MethodOverloading1 p = new MethodOverloading1();
		p.show(10,20);
		

	}

}
