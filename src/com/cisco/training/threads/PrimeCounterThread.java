package com.cisco.training.threads;

public class PrimeCounterThread extends Thread {
	
	long begin,end;

	long count;
	
	public PrimeCounterThread(long begin, long end) {
		super();
		this.begin = begin;
		this.end = end;
	}
	
	@Override
	public void run() {
		System.out.println("Beginning Prime counting from "+begin+" to "+end+" in "+Thread.currentThread().getName());
		for(long i = begin ; i <= end ; i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		System.out.println("Finished counting in thread "+Thread.currentThread().getName());
	}
	

	public static boolean isPrime(long num) {
		if (num <= 2) {
			return true;
		}
		for (long i = 2; i < num; i++) {
			if ((num % i) == 0) {
				return false;
			}
		}
		return true;
	}
	
	public long getCount() {
		return count;
	}
}
