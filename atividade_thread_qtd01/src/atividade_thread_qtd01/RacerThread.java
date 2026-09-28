package atividade_thread_qtd01;

public class RacerThread extends Thread{
	
	private int id;

    public RacerThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Racer " + id + " – imprimindo");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
