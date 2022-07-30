public class HourOfDay {
	
	public static void main(final String[] args) {
		
		for(int ii=0; ii<args.length; ii++) {
			System.out.print(args[ii] + " ");
			
			final int hourOfDay = Integer.parseInt(args[ii]);
			
			if (hourOfDay < 11) System.out.println("good morning");
			else if (hourOfDay < 15) System.out.println("good afternoon");
			else System.out.println("good evening");			
		}		
	}	
}