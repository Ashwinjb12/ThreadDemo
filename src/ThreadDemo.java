
public class ThreadDemo implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Thread threadOne = new Thread(new ThreadDemo());
//		threadOne.start();
//		Thread threadTwo = new Thread(new ThreadDemo());
//		threadTwo.start();

//		for (int i = 0; i < 100000000; i++) {
//			Thread threadOne = new Thread(new ThreadDemo());
//			threadOne.start();
//		}
		
		for (int i = 0; i < 100000000; i++) {
			ThreadClass threadOne = new ThreadClass();
			threadOne.start();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " is running for the " + i + " time.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}

	
}
