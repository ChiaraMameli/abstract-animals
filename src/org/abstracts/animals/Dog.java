package org.abstracts.animals;

public class Dog extends Animals implements Actions{

	@Override
	public String cry() {
		return "Wof";
		
	}

	@Override
	public String eat() {
		return "I eat bones";
	}

	@Override
	public String fly() {
		return "I can't fly!";
	}

	@Override
	public String swim() {
		return "I can't swim!";
	}


}
