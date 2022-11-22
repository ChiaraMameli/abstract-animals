package org.society.italy;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Employee chiara = new Employee("Chiara", "Mameli", "17685", 1600, 14);
		Employee ilaria = new Employee("Ilaria", "Pepe", "56536", 1400, 14);		
		Employee esposito = new Employee("Francesco", "Esposito", "88747", 1650, 15);				
		Boss federico = new Boss("Federico", "Aru", "00001", 3500, 15000);
		Boss giordano = new Boss("Francesca", "Giordano", "00002", 2700, 12000);
		
		Person [] company = {chiara, ilaria, esposito, federico, giordano};
		Employee [] employees = {chiara, ilaria, esposito};
		Boss [] bosses = {federico, giordano};
//		System.out.println(Arrays.toString(company));
		
		
		int minIncome = Integer.MAX_VALUE;
		int maxIncome = Integer.MIN_VALUE;
		int maxIncomeBoss = Integer.MIN_VALUE;
		int minIncomeEmployee = Integer.MAX_VALUE;
		String minIncomePerson = "";
		String maxIncomePerson = "";
		Boss maxIncomeBossP = null;
		Employee minIncomeEmployeeP = null;
		
		int companySalaries = 0;
		
		for(int x = 0; x < company.length; x++) {
			int income = company[x].getYearIncome();
			String person = company[x].getName() + " " + company[x].getSurname();
			
			if(income < minIncome) {
				minIncome = income;
				minIncomePerson = person;
			}
			if(income > maxIncome) {
				maxIncome = income;
				maxIncomePerson = person;
			}
			
			companySalaries += income;
			
			if(company[x] instanceof Boss) {
				Boss b = (Boss) company[x];
				if (income > maxIncomeBoss) {
					maxIncomeBoss = income;
					maxIncomeBossP = (Boss) company[x];
				}
			}
			
			if(company[x] instanceof Employee) {
				Employee e = (Employee) company[x];
				if (income < minIncomeEmployee) {
					minIncomeEmployee = e.getYearIncome();
					minIncomeEmployeeP = e;
				}
			}
		}
		
		int averageSalary = companySalaries / company.length;
		
		System.out.println("min income: " + minIncomePerson + " (" + minIncome + "€)");
		System.out.println("max income: " + maxIncomePerson + " (" + maxIncome + "€)");
		System.out.println("company salaries: " + companySalaries + "€");
		System.out.println("average salary: " + averageSalary + "€");
		
		System.out.println("---------------");
				
		System.out.println("max income boss: " + maxIncomeBossP.getFullName() + " (" + maxIncomeBoss + "€)");
		System.out.println("min income boss: " + minIncomeEmployeeP.getFullName() + " (" + minIncomeEmployee + "€)");
		
	}
}
