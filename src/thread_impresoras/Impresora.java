package thread_impresoras;

public class Impresora implements Runnable {

	public synchronized void imprimirTrabajo(Trabajo trabajo) throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Trabajo " + trabajo + " había imprimido");
	}

	@Override
	public void run() {
		try {
			imprimirTrabajo(null);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
