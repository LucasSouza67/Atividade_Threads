package atividade_thread_qtd03;

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

			boolean retirou = deposito.retirar();
			
			while(!retirou){
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				retirou = deposito.retirar();
			}
			
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
