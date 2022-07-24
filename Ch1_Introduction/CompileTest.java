class CompileTest {
	
	public static void main(final String[] args) {
		if (args.length==0) {
			System.out.println("Hello world!");
		} else {
			for (int ii=0; ii<args.length; ii++) {
				System.out.println(args[ii]);
			}
		}
	}
	
}