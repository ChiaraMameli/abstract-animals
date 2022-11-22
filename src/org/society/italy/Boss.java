package org.society.italy;

public class Boss extends Person {
	
	private int salary;
	private int bonus;
	
	public Boss(String name, String surname, String corporateCode, int salary, int bonus) {
		super(name, surname, corporateCode);
		setSalary(salary);
		setBonus(bonus);
	}

	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public int getYearIncome() {
		return (getSalary() * 12) + bonus;
	}
	
	@Override
	public String toString() {
		return "Boss: " 
				+ "\n" + super.toString()
				+ "\nRAL: " + getYearIncome() + "€"
				+ "\n----------------";
	}

}
