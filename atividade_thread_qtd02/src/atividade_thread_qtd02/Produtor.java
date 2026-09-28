package atividade_thread_qtd02;

public class Produtor extends Thread {

    private Deposito deposito;
    private int tempo;

    public Produtor(Deposito deposito, int tempo) {
        this.deposito = deposito;
        this.tempo = tempo;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {

            deposito.colocar();
            System.out.println("Produto adicionado");
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}