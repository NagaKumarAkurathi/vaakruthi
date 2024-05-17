package com.vaakruthi.anonymous;
class PopCorn{
	public void taste() {
		System.out.println("Salty");
	}
}
public class Test {
	public static void main(String[] args) {
		PopCorn p = new PopCorn() {
			public void taste() {System.out.println("Spicy");
			}
		};
		p.taste();//Spicy
		
		
		PopCorn p1 = new PopCorn();
		p1.taste();//Salty
		
		PopCorn p2 = new PopCorn() {
			public void taste() {
				System.out.println("Sweetly");
			}
		};
		p2.taste();//Sweetly
		System.out.println(p.getClass().getName());//Test$1
		System.out.println(p1.getClass().getName());//PopCorn
		System.out.println(p2.getClass().getName());//Test$2
	}
}
