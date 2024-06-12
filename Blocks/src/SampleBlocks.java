
public class SampleBlocks {

	{
		System.out.println(" First Instance block executed");
	}
	{
		System.out.println("Second instance block execution");
	}
	static {
		System.out.println("First static block executed");
	}
	static {
		System.out.println("Second instance block executed");

	}

	public static void main(String[] args) {
		int x = 10;
		String name = "Sahana";

		System.out.println("Main method executed");
		System.out.println(x);
		System.out.println(name);

		SampleBlocks sb1 = new SampleBlocks();
		SampleBlocks sb2 = new SampleBlocks();
	}

}
