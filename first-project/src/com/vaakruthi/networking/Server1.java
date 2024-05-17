package com.vaakruthi.networking;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(777);
		Socket s = ss.accept();
		System.out.println("Connection established...");
		OutputStream obj = s.getOutputStream();
		PrintStream ps = new PrintStream(obj);
		String str = "Hello Client";
		ps.println(str);
		ps.println("Bye");
		ps.close();
		ss.close();
		s.close();
	}
}
