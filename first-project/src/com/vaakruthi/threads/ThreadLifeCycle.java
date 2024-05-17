package com.vaakruthi.threads;

public class ThreadLifeCycle {
	/*
	 * Life Cycle of a Thread
	 * 
	 * A thread is the smallest unit of processing. A thread has six states
	 * 
	 * 1.New 2.Runnable 3.Blocked 4.Waiting 5.Timed_waiting 6.Terminated
	 * 
	 * New : Before the start() method is invoked and an instance of a thread is
	 * created.The thread come to new state.
	 * 
	 * Runnable : The life of a thread begins from this state.After the start()
	 * method is invoked, the thread first enters the runnable state.It can also
	 * enter this state after running,waiting,sleeping, or coming back from the
	 * blocked state.
	 * 
	 * Blocked : When the thread is in the waiting or suspended or blocked state.It
	 * is not allowed to enter the runnable state or running state.then it appears
	 * to be in the blocked status.
	 * 
	 * Waiting : The thread is said to be in the waiting state when it waits
	 * indefinitely for another thread to complete an action.
	 * 
	 * Timed_waiting : A thread that is waiting for another thread to perform an
	 * action for up to specified waiting time is in the state.When the thread is
	 * waiting for a specified time interval and transition back to the runnable
	 * state on expiration of the interval.
	 * 
	 * Terminated : When the thread has completed the execution of the run() method
	 * its life cycle comes to an end.The thread is killed by invokin the stop()
	 * method.coming to the dead state.
	 * 
	 */
}
