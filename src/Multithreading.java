import java.util.Scanner;

class Thread1 extends Thread {
	private int counter;
	public volatile boolean isRunning = true;
	@Override
	public void run() {
		while(isRunning) {
<<<<<<< HEAD
			System.out.println(counter);
=======
			System.out.println(counter + "*2 = " + counter*2);
>>>>>>> 7672eed15f68e4a1c490719e9509c640659d69ea
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
		Thread1 t1 = new Thread1();
		t1.start();
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		t1.isRunning = false;
	}

}
