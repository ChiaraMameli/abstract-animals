package org.abstracts.animals;

import org.abstracts.inter.IVolante;

public class Eagle extends Animals implements IVolante{

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
		return "I'm flying";
	}

}
