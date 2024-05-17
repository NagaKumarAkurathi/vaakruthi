package com.vaakruthi.networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/*
 * Networking :
Hardeware
Software 
Protocol

Protocol : A protocol represents a set of rules to be followed by every computer.
TCP/IP
(Transmission Control Protocol/Internet Protocol)
Application Layer
TCP
IP
Data Link
Physical Layer.

What is  IP address?
An IP address is unique identification number alloted to every computer on a networkor Internet.

What is DNS?
Domain Naming Service is a service on internet that maps the IP address with corresponding website names.

UDP
User Datagram Protocol.
Socket
A socket is point of connection point between a server and a client on a network.


URL
Uniform Resource Locator represents the address that is specified to access some information or resource on internet.
It contains 4 parts
1.The protocol to use (http://)
2.The server name or IP address of the server (www.vakruthi.com)
3.the third part is port number which is optional(:80)
4.last part is file (index.html)

URLConnection class
URLConnection classs is useful to connect to a website or resource in a network.
 */
public class Details {

	public static void main(String[] args) throws IOException {
		URL obj = new URL("https://www.vaakruthi.com/about.html");
		URLConnection connection = obj.openConnection();
		System.out.println("Date :" + new Date(connection.getDate()));
		System.out.println("Content type :" + connection.getContentType());
		System.out.println("Expries :" + connection.getExpiration());
		System.out.println("Last Modifiled :" + connection.getLastModified());
		int l = connection.getContentLength();
		if (l == 0) {
			System.out.println("Content not available");
		} else {
			int ch;
			InputStream in = connection.getInputStream();
			while ((ch = in.read()) != -1) {
				System.out.print((char) ch);
			}
		}

	}

}
