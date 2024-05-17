package com.vaakruthi.oops;

public class ClassNotes {
	/*
	 * 
Conversation opened. 1 read message.

Skip to content
Using Gmail with screen readers
47 of 52
Re: Updated invitation: java class -2 , Date 27/02/2024 @ Tue 27 Feb 2024 7:30am - 6pm (IST) (tulasi.prasad254@gmail.com)
Inbox

Tulasi Prasad <tulasi.prasad254@gmail.com>
Attachments
Tue, Feb 27, 9:03 AM
to lakshmi, nagachaitanya748, sirisha.dandu25, kandulavenkatesh828, msaibhaskar1, devipalaparthi347, karthiksajja456, me, pujithagadde04

Today Class Notes and PPT

On Mon, Feb 26, 2024 at 6:05 PM lakshmi vaakruthi <lakshmi@vaakruthi.us> wrote:
 
This event has been updated
Changed: Title, Time
 
Join with Google Meet
Meeting link
meet.google.com/ftf-hfjh-ukj
Join by phone
(US) +1 219-304-6449
PIN: 715439775

More phone numbers
When
CHANGED
Tuesday 27 Feb 2024 ⋅ 7:30am – 6pm (India Standard Time - Kolkata)
Monday 26 Feb 2024 ⋅ 7:30am – 6pm (India Standard Time - Kolkata)
Guests
lakshmi vaakruthi- organiser
nagachaitanya748@gmail.com
sirisha.dandu25@gmail.com
tulasi.prasad254@gmail.com
kandulavenkatesh828@gmail.com
msaibhaskar1@gmail.com
devipalaparthi347@gmail.com
karthiksajja456@gmail.com
nagak726@gmail.com
pujithagadde04@gmail.com
View all guest info
Reply for tulasi.prasad254@gmail.com
Yes
No
Maybe
More options
Invitation from Google Calendar

You are receiving this email because you are subscribed to Calendar notifications. To stop receiving these emails, go to Calendar settings, select this calendar and change ’Other notifications’.

Forwarding this invitation could allow any recipient to send a response to the organiser, be added to the guest list, invite others regardless of their own invitation status or modify your RSVP. Learn more

 2 Attachments
  •  Scanned by Gmail
Class/Object

Class/Object
- Definition: 
  - A class is a blueprint or template for creating objects in Java.
  - An object is an instance of a class.
- Key Points:
  - Classes define the properties (attributes) and behaviors (methods) of objects.
  - Objects represent real-world entities and are used to interact with the program.
- Example:
  - Class: `Car`
  - Object: `myCar`
  
  classname objectname = new classname();
  class FirstClass
  {
		int i=0;
		public void method()
		{
		// do something
		}
		public static void main(String[] args)
		{
		}
  }

Encapsulation

Encapsulation
- Definition:
  - Encapsulation is the bundling of data (attributes) and methods (behaviors) that operate on the data within a single unit, typically a class.
  - It restricts access to certain components of an object, providing better control over data integrity and security.
- Key Points:
  - Encapsulation promotes data hiding and abstraction.
  - Access to the internal state of an object is controlled through methods (getters and setters).
- Example:
  - Private data fields with public getter and setter methods in a `BankAccount` class.

Abstraction

Slide 3: Abstraction
- Definition:
  - Abstraction is the process of simplifying complex systems by focusing on the essential characteristics while hiding unnecessary details.
  - In Java, abstraction is achieved using abstract classes and interfaces.
- Key Points:
  - Abstract classes define incomplete methods (abstract methods) that must be implemented by subclasses.
  - Interfaces specify a set of methods that implementing classes must define.
- Example:
  - Abstract class `Shape` with abstract method `calculateArea()`.
  - Interface `Drawable` with method `draw()`.

Inheritance (extends and implements)**

Slide 4: Inheritance
- Definition:
  - Inheritance is a mechanism in Java where a new class (subclass) inherits properties and behaviors (methods) from an existing class (superclass).
  - Subclasses can extend the functionality of their superclass or implement interfaces to fulfill a contract.
- Key Points:
  - Subclasses inherit attributes and methods from their superclass.
  - Java supports single inheritance (one class can only inherit from one superclass) and multiple interfaces.
- Example:
  - `Vehicle` superclass and subclasses `Car` and `Motorcycle`.
  - Interface `Runnable` implemented by class `Dog`.
  
  class Parent
  {
    ....
	int calculate(int x)
	{
	  return Math.squrt(x);
	}
	
	int calculate(int x, int y)
	{
	  return x+y;
	}
	
	calculate(10,20);
	...
  }
  
  class Child extends Parent
  {
     @Override`
     int calculate(int x)
	 {
	    return (x*x*x);
	 }
	 int k=10;
	 int calculate()
	 {
	   return k+k;
	 }
  }
  
  interface Functionality
  {
	void showBalance();
	void withdraw();
  }
  
  class customerRealEstate implements Functionality
  {
	 void showBalance()
	 {
	 ......
	 ...
	 }
	 void withdraw()
	 {
	 ....
	 ....
	 }
  }
  

Polymorphism

Slide 5: Polymorphism
- Definition:
  - Polymorphism allows objects of different classes to be treated as objects of a common superclass.
  - It enables methods to behave differently based on the object they are invoked upon, achieving flexibility and reusability.
- Key Points:
  - Polymorphism is achieved through method overriding and method overloading.
  - Dynamic polymorphism is resolved at runtime.
- Example:
  - Method `makeSound()` in superclass `Animal` overridden in subclasses `Dog` and `Cat`.
  - Method `calculateArea()` overloaded in class `Shape`.

Overloading

Slide 6: Overloading
- Definition:
  - Method overloading allows a class to have multiple methods with the same name but different parameter lists.
  - It enables flexibility in method invocation, where the appropriate method is chosen based on the arguments passed.
- Key Points:
  - Overloaded methods must have different parameter lists (number, type, or order of parameters).
  - Overloading can occur within the same class or between parent and child classes.
- Example:
  - Class `Calculator` with overloaded methods `add(int, int)` and `add(double, double)`.

Overriding

Slide 7: Overriding
- Definition:
  - Method overriding occurs when a subclass provides a specific implementation of a method that is already defined in its superclass.
  - It allows for dynamic polymorphism, where the appropriate method is invoked at runtime based on the object's type.
- Key Points:
  - Overridden methods must have the same signature (name, return type, and parameter list) as the superclass method.
  - The `@Override` annotation is used to indicate that a method is intended to override a superclass method.
- Example:
  - Method `displayInfo()` in subclass `Employee` overrides method `displayInfo()` in superclass `Person`.

Slide 8: Conclusion
- Conclusion:
  - Understanding object-oriented programming concepts is crucial for developing robust and maintainable Java applications.
  - Classes, encapsulation, abstraction, inheritance, polymorphism, overloading, and overriding form the foundation of object-oriented design in Java.
- Questions?
  - Open the floor for any questions or discussions.

Slide 9: Thank You!
- Thank You for Your Attention!**
  - Contact Information (Optional)
  - Additional Resources or References (Optional)
OOPS.txt
Displaying OOPS.txt.
	 * 
	 */
}
