package calc;

public class Greet {

	public static void main(String[] args) {
		System.out.println("Welcome");
		System.out.println("Siva");
		
		Math math = new Math();
		math.setVar1(40);
		math.setVar2(60);
		
		System.out.println(math.add());
	}

}
