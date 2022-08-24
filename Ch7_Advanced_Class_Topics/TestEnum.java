public enum TestEnum {
	
	WINTER("cold"){
		public int getAvgTemp() {
			return 30;
		}
		public String getHours() {
			return "10am-3pm";
		}
	}, 
	SPRING("nice"){
		public int getAvgTemp() {
			return 60;
		}
	}, 
	SUMMER("hot"){
		public int getAvgTemp() {
			return 70;
		}
		public String getHours() {
			return "8am-6pm";
		}
	}, 
	FALL("nice"){
		public int getAvgTemp() {
			return 58;
		}
	};
	
	private final String relTemp;
	
	TestEnum(final String t) {
		this.relTemp = t;
	}
	
	public String getRelTemp() {
		return this.relTemp;
	}
	
	public abstract int getAvgTemp();
	
	public String getHours() {
		return "9am-5pm";
	}
	
	public static void main(final String... args) {
		for (final var s : TestEnum.values()) {
			System.out.println(s.name() + " " + s.ordinal() + 
				", temp= " + s.getAvgTemp() + "(" + s.getRelTemp() +
				"), hours=" + s.getHours()
			);
		}
	}
}