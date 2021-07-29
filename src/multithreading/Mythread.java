package multithreading;

public class Mythread implements Runnable {
	static int cnt = 0;

	public static void main(String[] args) throws Exception {
		Mythread mt1 = new Mythread();
		Mythread mt2 = new Mythread();
		Thread t1 = new Thread(mt1);
//		Thread t2 = new Thread(mt2);
		t1.start();
//		t2.start();
		while (true) {
			try {
				if (cnt >= 25) {
					t1.yield();
//					t1.wait();
//					t1.stop();
//					t2.stop();
//					Thread.sleep(10000);
					System.out.println("Hello "+cnt);
					break;
				}
			} finally {
			}
		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("In thread");
		for (int i = 0; i < 50; i++) {
			System.out.println("In thread " + i);
			cnt++;
		}
	}
}
