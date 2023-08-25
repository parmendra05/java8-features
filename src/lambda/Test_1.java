package lambda;

public class Test_1 {

	public static void main(String[] args) {
		// Before java 8 Without Lambda
		Oppo oppo = new Oppo();
		oppo.greet();

		// without lambda with anonymous inner type
		Mobile samsung = new Mobile() {

			@Override
			public void greet() {
				System.out.println("Welcome to Samsung mobile, anonymous function");

			}
		};
		samsung.greet();

		// With Lambda
		Mobile vivo = () -> System.out.println("Welcome to Vivo Mobile, with Lambda");
		vivo.greet();
	}
}

interface Mobile {
	public void greet();
}

class Oppo implements Mobile {

	public void greet() {

		System.out.println("Welcome to Oppo Mobile");
	}
}
