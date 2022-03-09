package DemoModule;

public class MethodOverloading {
	void show()
	{
		System.out.println("1");
	}
	void show(int a, int b)
	{
		System.out.println("2");
	}

	public static void main(String[] args) {
		MethodOverloading p = new MethodOverloading();
		p.show();
		

	}

}
