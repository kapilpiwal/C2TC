package m11batch;

import java.util.concurrent.locks.ReentrantLock;

public class Concurrency {

	public static void main(String[] args) {
		ReentrantLock l=new ReentrantLock();
		
		l.lock();
		l.lock();
		l.lock();
		l.lock();
		l.lock();
		l.lock();
		System.out.println(l.getHoldCount());
		
		System.out.println(l.isLocked());
		
		l.unlock();
		
		System.out.println(l.isLocked());
		
		System.out.println(l.getQueueLength());
		
		System.out.println(l.isHeldByCurrentThread());

	}

}
