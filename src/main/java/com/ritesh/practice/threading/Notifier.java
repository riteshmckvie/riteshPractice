package com.ritesh.practice.threading;

public class Notifier implements Runnable {

	private Message msg;

	public Notifier(Message msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " started");
		try {
			Thread.sleep(1000);
			synchronized (msg) {
				msg.setMsg(name + " Notifier work done");
				//msg.notify();

				msg.wait();
				msg.notifyAll();
				System.out.println(".....");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
