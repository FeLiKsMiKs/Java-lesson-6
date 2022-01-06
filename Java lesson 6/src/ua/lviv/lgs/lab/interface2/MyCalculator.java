package ua.lviv.lgs.lab.interface2;

public class MyCalculator implements ua.lviv.lgs.lab.interface1.Numerable {

	double a;
	double b;
	public MyCalculator() {
	}
	public MyCalculator(double a, double b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public double plus() {
		return a+b;
	}

	@Override
	public double minus() {
	
		return a-b;
	}

	@Override
	public double multiply() {
		
		return a*b;
	}

	@Override
	public double divide() {
		
		return a/b;
	}
	static void Result(double result) {
		System.out.println("Result is "+result);
	}
}
