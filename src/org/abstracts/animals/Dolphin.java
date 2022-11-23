package org.abstracts.animals;

import org.abstracts.inter.INuotante;

public class Dolphin extends Animals implements INuotante{

	@Override
	public String cry() {
		return "Krr";
	}

	@Override
	public String eat() {
		return "I eat shrimps";
	}

	@Override
	public String swim() {
		return "I'm swimming";
	}

}
