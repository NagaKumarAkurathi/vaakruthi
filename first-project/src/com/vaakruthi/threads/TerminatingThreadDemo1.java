package com.vaakruthi.threads;

import java.io.IOException;

public class TerminatingThreadDemo1 {
	public static void main(String[] args) throws IOException {
		TerminatingThread tt = new TerminatingThread();
		Thread t  = new Thread(tt);
		t.start();
		System.in.read();//wait till enter any  key pressed
		tt.stop = true;
	}
}
