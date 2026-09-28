package atividade_thread_qtd01;

public class RacerRunnable implements Runnable {

    private int id;

    public RacerRunnable(int id) {
        this.id = id;
    }
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("Racer " + id + " – imprimindo");
        }
    }
}
