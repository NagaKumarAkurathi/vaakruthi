package com.vaakruthi.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
/*
 * 
Conversation opened. 1 read message.

Skip to content
Using Gmail with screen readers
16 of 52
Re: Updated invitation: java class -9, Date 11-03-2024 @ Mon 11 Mar 2024 7am - 6pm (IST) (tulasi.prasad254@gmail.com)
Inbox

Tulasi Prasad <tulasi.prasad254@gmail.com>
Attachments
Mon, Mar 11, 1:29 PM (11 days ago)
to lakshmi, nagachaitanya748, sirisha.dandu25, kandulavenkatesh828, msaibhaskar1, devipalaparthi347, karthiksajja456, me, pujithagadde04, charan74493, aswini9267

Today Class Notes

On Sun, Mar 10, 2024 at 6:02 PM lakshmi vaakruthi <lakshmi@vaakruthi.us> wrote:
 
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
Monday 11 Mar 2024 ⋅ 7am – 6pm (India Standard Time - Kolkata)
Thursday 7 Mar 2024 ⋅ 7am – 6pm (India Standard Time - Kolkata)
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
charan74493@gmail.com
aswini9267@gmail.com
View all guest info
Reply for tulasi.prasad254@gmail.com
Yes
No
Maybe
More options
Invitation from Google Calendar

You are receiving this email because you are subscribed to Calendar notifications. To stop receiving these emails, go to Calendar settings, select this calendar and change ’Other notifications’.

Forwarding this invitation could allow any recipient to send a response to the organiser, be added to the guest list, invite others regardless of their own invitation status or modify your RSVP. Learn more

 One attachment
  •  Scanned by Gmail
				
				
				
				|					   |
				| ____6______________   |
				|                      |
				| ____5______________   |
				|                      |
				| ___4_______________   |
				|                      |
				| ____3______________   |
				|                      |
				| ___2_______________   |
				|                      |
				|____1__________________|
				
				
				Stack represents a group of elements strored in LIFO. This means that the element which is stored as a last element into the stack will be the the first element to be removed from the stack.
				
				Inserting elements into the stack is called push operation.
				Removing elements from the stack is called pop operation.
				Searching of elements in the stack is called peek operation.
				
				boolean empty() -> This method tests whether the stack is empty or not.If the stack is empty then true is returned otherwise false.
				
				element peek() -> This method returns the top-most element from the stack without removing it. 
				
				element pop() -> This method pops the top most element from the stack and returns it.
				
				element push(element obj) -> This method pushes an element obj onto the top of the stack and returns that element.
				
				int search(Object obj) -> This method return the position of an element obj from top of the stack. if element is not found in the stack then it returns -1.
				
				Stack<Integer> st = new Stack<>();
	
Stack.txt
Displaying Stack.txt.
 */
public class StackDemo {
	public static void main(String[] args) throws IOException{
		Stack<Integer> st = new Stack<Integer>();
		int choice=0;
		int pos,ele;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(choice<4) {
			System.out.println("STACK OPERATIONS");
			System.out.println("1. Push an element");
			System.out.println("2. Pop an element");
			System.out.println("3. Search an element");
			System.out.println("4. Exit");
			System.out.println("Enter your choice:");
			choice=Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:
				System.out.println("Enter Element:");
				ele=Integer.parseInt(br.readLine());
				st.push(ele);
				break;
			case 2:
				Integer obj = st.pop();
				System.out.println("Popped Element :"+obj);
				break;
			case 3:
				System.out.println("Which element:");
				ele=Integer.parseInt(br.readLine());
				pos=st.search(ele);
				if(pos == -1)
				{
					System.out.println("Element not found..");
				}
				else {
					System.out.println("Element found in postion :"+pos);
				}
				break;
			default:
				return;
			}
			System.out.println("Stack Content..."+st);
		}
	}
}
