package com.vaakruthi.enumuration;
enum Color{
	GREEN,RED,BLUE,WHITE,PINK
}
public class ColourTest {
	Color c;
	public ColourTest(Color c) {
		super();
		this.c = c;
	}
	void display() {
		switch (c) {
		case RED:
			System.out.println("Red colour");
			break;
		case BLUE:
			System.out.println("Blue Colour");
			break;
		case GREEN:
			System.out.println("Green colour");
			break;
		case WHITE:
			System.out.println("White colour");
			break;
		case PINK:
			System.out.println("Pink colour");
		default:
			System.out.println("Not a good colour");
			break;
		}
	}
	public static void main(String[] args) {
		ColourTest ct = new ColourTest(Color.BLUE);
		ct.display();
	}
}
