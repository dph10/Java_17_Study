public class InitializationExampleClass {
	private String name = "Bill"; // field initialization runs first
	{ System.out.print(name + ", "); // instance initializer block runs 2nd
		name = "Molly";
		System.out.print(name + ", ");
	}
	public InitializationExampleClass() { // constructor runs 3rd
		name = "Sarah";
		System.out.print(name);
	}

	public static void main(final String args[]) {
		final InitializationExampleClass ex = new InitializationExampleClass();
		// code output: Bill, Molly, Sarah
	}
}

