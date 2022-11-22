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
		String minIncomePerson = "";
		String maxIncomePerson = "";
		
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
		}
		
		int averageSalary = companySalaries / company.length;
		
		System.out.println("min income: " + minIncomePerson + " (" + minIncome + "€)");
		System.out.println("max income: " + maxIncomePerson + " (" + maxIncome + "€)");
		System.out.println("company salaries: " + companySalaries + "€");
		System.out.println("average salary: " + averageSalary + "€");
		
		System.out.println("---------------");
		
		int minIncomeEmployeeS = Integer.MAX_VALUE;
		String minIncomeEmployee = "";
		
		for(int x = 0; x < employees.length; x++) {
			int income = employees[x].getYearIncome();
			String employee = employees[x].getName() + " " + employees[x].getSurname();
			
			if(minIncomeEmployeeS > income) {
				minIncomeEmployeeS = income;
				minIncomeEmployee = employee;
			}
		}
		
		System.out.println("min income employee: " + minIncomeEmployee + " (" + minIncomeEmployeeS + "€)");
		
		System.out.println("---------------");
		
		int maxIncomeBossS = Integer.MIN_VALUE;
		String maxIncomeBoss = "";
		
		for(int x = 0; x < bosses.length; x++) {
			int income = bosses[x].getYearIncome();
			String boss = bosses[x].getName() + " " + bosses[x].getSurname();
			
			if(maxIncomeBossS < income) {
				maxIncomeBossS = income;
				maxIncomeBoss = boss;
			}
		}
		
		System.out.println("max income boss: " + maxIncomeBoss + " (" + maxIncomeBossS + "€)");
		
	}
}
