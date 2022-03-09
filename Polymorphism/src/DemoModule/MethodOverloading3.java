package DemoModule;

public class MethodOverloading3 {
	void show(int a, String b)
	{
		System.out.println("1");
	}
	void show(String a, int b)
	{
		System.out.println("2");
	}

	public static void main(String[] args) {
		MethodOverloading3 p = new MethodOverloading3();
		p.show(10, "abc");
		
		

	}

}
