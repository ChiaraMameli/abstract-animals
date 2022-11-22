package org.society.italy;

public class Employee extends Person {
	
	private int salary;
	private int monthlyCount;
	
	public Employee(String name, String surname, String corporateCode, int salary, int monthlyCount) {
		super(name, surname, corporateCode);
		setSalary(salary);
		setMonthlyCount(monthlyCount);
	}		
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getMonthlyCount() {
		return monthlyCount;
	}
	public void setMonthlyCount(int monthlyCount) {
		this.monthlyCount = monthlyCount;
	}

	@Override
	public int getYearIncome() {
		return getSalary() * getMonthlyCount();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee: " 
				+ "\n" + super.toString()
				+ "\nRAL: " + getYearIncome() + "€"
				+ "\n----------------";
	}
	
}
