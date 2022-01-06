package ua.lviv.lgs.salary;



public class Application{
	static void Salary(Salary s) {
		s.salary();
	}
	public static void main(String[] args) {
		Salary s1 = new HourSalary();
		Salary(s1);
		Salary s2 = new MonthSalary();
		Salary(s2);
	}

}
