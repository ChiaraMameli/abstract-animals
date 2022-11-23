package org.abstracts.animals;

import org.abstracts.inter.INuotante;
import org.abstracts.inter.IVolante;

public class Main {
	public static void main(String[] args) {
		Dog pluto = new Dog();
		System.out.println(pluto.sleep());
		System.out.println(pluto.cry());
		System.out.println(pluto.eat());
		
		System.out.println("-------------");
		
		Sparrow tweety = new Sparrow();
		System.out.println(tweety.sleep());
		System.out.println(tweety.cry());
		System.out.println(tweety.eat());
		faiVolare(tweety);
		
		System.out.println("-------------");
		
		Eagle sam = new Eagle();
		System.out.println(sam.sleep());
		System.out.println(sam.cry());
		System.out.println(sam.eat());
		faiVolare(sam);
		
		System.out.println("-------------");
		
		Dolphin nosy = new Dolphin();
		System.out.println(nosy.sleep());
		System.out.println(nosy.cry());
		System.out.println(nosy.eat());
		faiNuotare(nosy);
		
		System.out.println("-------------");
		

	}
	
	static void faiVolare(IVolante animal) {
		System.out.println(animal.fly());
	}
	
	static void faiNuotare(INuotante animal) {
		System.out.println(animal.swim());
	}
}
