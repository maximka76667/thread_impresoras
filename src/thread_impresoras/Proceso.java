package thread_impresoras;

public class Proceso implements Runnable {

	private boolean estaProcesando;
	private int tipo, contador;

	public Proceso() {
		this.contador = 0;
		this.estaProcesando = false;
		this.tipo = (int) Math.floor(Math.random() * 2);
	}

	public synchronized void generarTrabajo() throws InterruptedException {
		Thread.sleep(2000);
		Trabajo nuevoTrabajo = new Trabajo("#" + contador);
		contador++;
		System.out.println(nuevoTrabajo);
		imprimirTrabajo(nuevoTrabajo);
	}

	@Override
	public void run() {
		while (!estaProcesando) {
			try {
				generarTrabajo();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
