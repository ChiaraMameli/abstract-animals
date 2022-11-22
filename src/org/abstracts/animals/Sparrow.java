package org.abstracts.animals;

public class Sparrow extends Animals implements Actions{

	@Override
	public String cry() {
		return "Tweet";
	}

	@Override
	public String eat() {
		return "I eat worms";
	}

	@Override
	public String fly() {
		return "I'm flying!";
	}

	@Override
	public String swim() {
		return "I can't swim";
	}

}
