import java.util.Scanner;

class Thread1 extends Thread {
	private int counter;
	public volatile boolean isRunning = true;
	@Override
	public void run() {
		while(isRunning) {
			System.out.println(counter);
			counter++;
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Multithreading {

	public static void main(String[] args) {
		System.out.println("Starting thread 1:");
		Thread1 t1 = new Thread1();
		t1.start();
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		t1.isRunning = false;
	}

}
