package atividade_thread_qtd02;

public class Consumidor extends Thread {

	private Deposito deposito;
	private int tempo;

	public Consumidor(Deposito deposito, int tempo) {
		this.deposito = deposito;
		this.tempo = tempo;
	}

	@Override
	public void run() {

		for (int i = 0; i < 20; i++) {

			deposito.retirar();
			
			System.out.println("Retirada realizada");

			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
