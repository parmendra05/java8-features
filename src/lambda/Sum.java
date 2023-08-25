package lambda;

public class Sum {

	public static void main(String[] args) {

		// anonymous inner type
		Addition addition = new Addition() {
			@Override
			public void add(int a, int b) {
				System.out.println("Addition is : " + (a + b));
			}
		};
		// Calling anonymous function
		addition.add(5, 10);

		// With Lambda
		Addition cal = (a, b) -> System.out.println(a + b);
		cal.add(8, 32);
	}

}

interface Addition {
	public void add(int a, int b);
}