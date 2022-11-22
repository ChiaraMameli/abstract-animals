package org.abstracts.animals;

public class Main {
	public static void main(String[] args) {
		Dog pluto = new Dog();
		System.out.println(pluto.sleep());
		System.out.println(pluto.cry());
		System.out.println(pluto.eat());
		System.out.println(pluto.fly());
		
		System.out.println("-------------");
		
		Sparrow tweety = new Sparrow();
		System.out.println(tweety.sleep());
		System.out.println(tweety.cry());
		System.out.println(tweety.eat());
		System.out.println(tweety.fly());
		
		System.out.println("-------------");
		
		Eagle sam = new Eagle();
		System.out.println(sam.sleep());
		System.out.println(sam.cry());
		System.out.println(sam.eat());
		System.out.println(sam.fly());
		
		System.out.println("-------------");
		
		Dolphin nosy = new Dolphin();
		System.out.println(nosy.sleep());
		System.out.println(nosy.cry());
		System.out.println(nosy.eat());
		System.out.println(nosy.swim());
		
		System.out.println("-------------");
	}
}
