package thread_impresoras;

public class Main {

	public static void main(String[] args) {
		Thread tProceso = new Thread(new Proceso());
		Thread tImpresora = new Thread(new Impresora());

		tProceso.start();
	}

}
