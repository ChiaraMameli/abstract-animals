package org.abstracts.animals;

import org.abstracts.inter.IVolante;

public class Sparrow extends Animals implements IVolante{

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
		return "I'm flying";
	}
}
