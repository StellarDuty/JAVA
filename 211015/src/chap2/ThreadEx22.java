package chap2;

public class ThreadEx22 {

	public static void main(String[] args) {
		Runnable r = new RunnableEx22();
		new Thread(r).start();
		new Thread(r).start();
	}

}
