package org.abstracts.animals;

public class Dolphin extends Animals implements Actions {

	@Override
	public String cry() {
		return "Krr";
	}

	@Override
	public String eat() {
		return "I eat shrimps";
	}

	@Override
	public String fly() {
		return "I can't fly";
	}

	@Override
	public String swim() {
		return "I'm swimming!";
	}

}
