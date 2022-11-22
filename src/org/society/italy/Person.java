package org.society.italy;

import java.time.LocalDate;

public abstract class Person {
	
	private String name;
	private String surname;
	private String corporateCode;
	private LocalDate dateOfBirth;
	
	public Person(String name, String surname, String corporateCode) {
		setName(name);
		setSurname(surname);
		setDateOfBirth(LocalDate.now());
		setCorporateCode(corporateCode);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getCorporateCode() {
		return corporateCode;
	}
	public void setCorporateCode(String corporateCode) {
		this.corporateCode = corporateCode;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getFullName() {
		return name + " " + surname 
				+ " (" + dateOfBirth + ")";
	}
	
	public abstract int getYearIncome();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getFullName()
				+ " - " + corporateCode;
	}
	
}
