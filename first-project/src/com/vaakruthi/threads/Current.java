package com.vaakruthi.threads;

/*
 * Threads
A thread represents a separate path of execution of a group of statements.
If we write a group of statements then these statements are executed by JVM one by one.
This execution is called a thread.
Threads are light-weight because they utilize minimum resources of the system.This means they take less memory and less process time
 */
public class Current {
	public static void main(String[] args) {
		System.out.println("Let us find current thread ..");
		Thread t = Thread.currentThread();// currentThread() is static method in Thread class.
		System.out.println("Current Thread :" + t);
		System.out.println("Current thread name :" + t.getName());
	}
}
