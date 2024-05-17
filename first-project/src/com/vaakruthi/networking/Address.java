package com.vaakruthi.networking;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Address {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter website name:");
		String site = sc.nextLine();
		try {
			InetAddress ip = InetAddress.getByName(site);
			System.out.println("The IP Address is :"+ip);
		} catch (UnknownHostException e) {
			System.out.println("Website not found");
			e.printStackTrace();
		}

	}

}
