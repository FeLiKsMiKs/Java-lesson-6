package ua.lviv.lgs.lab.interface2;

public class Application {
	public static void main(String[] args) {
		MyCalculator c = new MyCalculator(7, 3.5);
		MyCalculator.Result(c.plus());
		MyCalculator.Result(c.minus());
		MyCalculator.Result(c.multiply());
		MyCalculator.Result(c.divide());
	}


}
