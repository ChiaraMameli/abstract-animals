package org.abstracts.animals;

public class Eagle extends Animals implements Actions {

	@Override
	public String cry() {
		return "Cry";
	}

	@Override
	public String eat() {
		return "I eat rabbits";
	}

	@Override
	public String fly() {
		return "I'm flying!";
	}

	@Override
	public String swim() {
		return "I can't swim!";
	}

}
